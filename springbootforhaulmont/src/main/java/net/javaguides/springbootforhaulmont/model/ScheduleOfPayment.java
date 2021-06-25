package net.javaguides.springbootforhaulmont.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;



@Entity
@Data
@Table(name = "SCHEDULE_OF_PAYMENT")
    public class ScheduleOfPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SCHEDULE_OF_PAYMENT_ID")
    private UUID id;

    @Column(name = "DATE_OF_PAYMENT")
    private LocalDate dateOfPayment;

    @Column(name = "AMOUNT_OF_PAYMENT")
    private BigDecimal amountOfPayment;

    @Column(name = "AMOUNT_OF_PAYMENT_PER_BODY")
    private BigDecimal amountOfPaymentPerBody;

    @Column(name = "AMOUNT_OF_REPAYMENT_PERCENT")
    private BigDecimal amountOfRepaymentPercent;

    @ManyToOne
    @JoinColumn(name = "OFFER_OF_CREDIT_ID")
    private OfferOfCredit offerOfCredit;

    public ScheduleOfPayment() {
    }

    public ScheduleOfPayment(UUID id, LocalDate dateOfPayment, BigDecimal amountOfPayment, BigDecimal amountOfPaymentPerBody, BigDecimal amountOfRepaymentPercent, OfferOfCredit offerOfCredit) {
        this.id = id;
        this.dateOfPayment = dateOfPayment;
        this.amountOfPayment = amountOfPayment;
        this.amountOfPaymentPerBody = amountOfPaymentPerBody;
        this.amountOfRepaymentPercent = amountOfRepaymentPercent;
        this.offerOfCredit = offerOfCredit;
    }
}
