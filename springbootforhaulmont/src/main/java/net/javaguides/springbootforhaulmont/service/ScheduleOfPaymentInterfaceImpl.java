package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.ScheduleOfPayment;
import net.javaguides.springbootforhaulmont.repository.ScheduleOfPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ScheduleOfPaymentInterfaceImpl implements ScheduleOfPaymentInterface {

    private final ScheduleOfPaymentRepository scheduleOfPaymentRepository;

    @Autowired
    public ScheduleOfPaymentInterfaceImpl(ScheduleOfPaymentRepository scheduleOfPaymentRepository) {
        this.scheduleOfPaymentRepository = scheduleOfPaymentRepository;
    }

    @Override
    public ScheduleOfPayment findScheduleOfPaymentById(UUID id) {
        return scheduleOfPaymentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteScheduleOfPaymentById(UUID id) {
        scheduleOfPaymentRepository.deleteById(id);
    }

    @Override
    public void saveAllScheduleOfPayment(List<ScheduleOfPayment> scheduleOfPaymentList) {
        scheduleOfPaymentRepository.saveAll(scheduleOfPaymentList);

    }

    @Override
    public void saveScheduleOfPayment(ScheduleOfPayment scheduleOfPayment) {
        this.scheduleOfPaymentRepository.save(scheduleOfPayment);

    }

    @Override
    public void deleteAllByCreditOfferId(UUID offerOfCreditId) {
        scheduleOfPaymentRepository.deleteAllByOfferOfCreditId(offerOfCreditId);

    }

    @Override
    public List<ScheduleOfPayment> findByOfferOfCreditId(UUID offerOfCreditId) {
        return scheduleOfPaymentRepository.findByOfferOfCreditId(offerOfCreditId);
    }
}
