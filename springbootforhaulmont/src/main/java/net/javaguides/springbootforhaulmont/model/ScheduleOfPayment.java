package net.javaguides.springbootforhaulmont.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;



@Entity
@Data
@Table("Schedule_of_payment")
    public class ScheduleOfPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "schedule_of_payment_id")
    private UUID id;

    @Column(name = "date_of_payment")
    private LocalDate dateOfPayment;

    @Column(name = "amount_of_payment")
    private BigDecimal amountOfPayment;

    @Column(name = "amount_of_payment_per_body")
    private BigDecimal amountOfPaymentPerBody;

    @Column(name = "amount_of_repayment_percent")
    private BigDecimal amountOfRepaymentPercent;

    @ManyToOne
    @JoinColumn(name = "offer_of_credit_id")
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
