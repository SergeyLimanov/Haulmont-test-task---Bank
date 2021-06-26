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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDate dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public BigDecimal getAmountOfPayment() {
        return amountOfPayment;
    }

    public void setAmountOfPayment(BigDecimal amountOfPayment) {
        this.amountOfPayment = amountOfPayment;
    }

    public BigDecimal getAmountOfPaymentPerBody() {
        return amountOfPaymentPerBody;
    }

    public void setAmountOfPaymentPerBody(BigDecimal amountOfPaymentPerBody) {
        this.amountOfPaymentPerBody = amountOfPaymentPerBody;
    }

    public BigDecimal getAmountOfRepaymentPercent() {
        return amountOfRepaymentPercent;
    }

    public void setAmountOfRepaymentPercent(BigDecimal amountOfRepaymentPercent) {
        this.amountOfRepaymentPercent = amountOfRepaymentPercent;
    }

    public OfferOfCredit getOfferOfCredit() {
        return offerOfCredit;
    }

    public void setOfferOfCredit(OfferOfCredit offerOfCredit) {
        this.offerOfCredit = offerOfCredit;
    }

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
