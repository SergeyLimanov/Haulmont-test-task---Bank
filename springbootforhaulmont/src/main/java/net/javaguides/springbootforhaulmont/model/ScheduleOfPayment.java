package net.javaguides.springbootforhaulmont.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class ScheduleOfPayment {

    private UUID id;

    private LocalDate dateOfPayment;
    private BigDecimal amountOfPayment;
    private BigDecimal amountOfPaymentPerBody;
    private BigDecimal interestRepaymentAmount;
    private OfferOfCredit offerOfCredit;
}
