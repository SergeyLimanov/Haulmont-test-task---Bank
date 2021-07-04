package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.OfferOfCredit;
import net.javaguides.springbootforhaulmont.model.ScheduleOfPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class CalculationPaymentServiceInterfaceImpl implements CalculationPaymentServiceInterface {
    private final OfferOfCreditInterface offerOfCreditInterface;
    private final ScheduleOfPaymentInterface scheduleOfPaymentInterface;
    private final EntityManager entityManager;

    @Autowired
    public CalculationPaymentServiceInterfaceImpl(OfferOfCreditInterface offerOfCreditInterface, ScheduleOfPaymentInterface scheduleOfPaymentInterface, EntityManager entityManager) {
        this.offerOfCreditInterface = offerOfCreditInterface;
        this.scheduleOfPaymentInterface = scheduleOfPaymentInterface;
        this.entityManager = entityManager;
    }

    @Override
    public void collectDataAboutOfferOfCredit(OfferOfCredit offerOfCredit) {
        if (offerOfCredit.getId() != null) {
            offerOfCredit = mergeAndClearPaymentScheduleList(offerOfCredit);
        }
        BigDecimal firstPay = offerOfCredit.getFirstPayment() != null
                ? offerOfCredit.getFirstPayment()
                : BigDecimal.ZERO;
        BigDecimal remainingCreditAmount = offerOfCredit.getSum().subtract(firstPay);
        BigDecimal monthlyPaymentToBodyCredit = remainingCreditAmount
                .divide(BigDecimal.valueOf(offerOfCredit.getCreditTerm()),2, RoundingMode.HALF_EVEN);
        BigDecimal interestRatePerMonth = offerOfCredit.getCredit().getCreditPercentage()
                .divide(BigDecimal.valueOf(12),4, RoundingMode.HALF_EVEN);
        BigDecimal monthlyPaymentToPercentCredit = remainingCreditAmount.multiply(interestRatePerMonth)
                .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_EVEN);
        calculateAndCreatePaymentSchedules(remainingCreditAmount, monthlyPaymentToBodyCredit,
                monthlyPaymentToPercentCredit, offerOfCredit);
    }

    private void calculateAndCreatePaymentSchedules(BigDecimal remainingCreditAmount,
                                                    BigDecimal monthlyPaymentToBodyCredit,
                                                    BigDecimal monthlyPaymentToPercentCredit,
                                                    OfferOfCredit offerOfCredit) {
        Integer periodInMonths = offerOfCredit.getCreditTerm();
        BigDecimal monthPay, percentSum = BigDecimal.ZERO;
        List<ScheduleOfPayment> paymentScheduleList = new ArrayList<>(periodInMonths);
        for (int i = 0; i < periodInMonths; i++) {
            monthPay = monthlyPaymentToBodyCredit.add(monthlyPaymentToPercentCredit);
            percentSum = percentSum.add(monthlyPaymentToPercentCredit);
            remainingCreditAmount = remainingCreditAmount.subtract(monthlyPaymentToBodyCredit);
            paymentScheduleList.add(
                    ScheduleOfPayment.builder()
                            .amountOfPayment(monthPay)
                            .dateOfPayment(LocalDate.now().plusMonths(i + 1))
                            .amountOfPaymentPerBody(monthlyPaymentToBodyCredit)
                            .amountOfRepaymentPercent(monthlyPaymentToPercentCredit)
                            .remains(remainingCreditAmount.compareTo(BigDecimal.ZERO) > 0
                                    ? remainingCreditAmount
                                    : BigDecimal.ZERO)
                            .offerOfCredit(offerOfCredit)
                            .build()
            );
        }
        offerOfCredit.setSumOfPercent(percentSum);
        saveAll(offerOfCredit, paymentScheduleList);
    }

    private void saveAll(OfferOfCredit offerOfCredit, List<ScheduleOfPayment> paymentScheduleList) {
        offerOfCreditInterface.saveOfferOfCredit(offerOfCredit);
        scheduleOfPaymentInterface.saveAllScheduleOfPayment(paymentScheduleList);
    }

    private OfferOfCredit mergeAndClearPaymentScheduleList(OfferOfCredit offerOfCredit) {
        offerOfCredit = entityManager.merge(offerOfCredit);
        scheduleOfPaymentInterface.deleteAllByCreditOfferId(offerOfCredit.getId());
        return offerOfCredit;
    }
}