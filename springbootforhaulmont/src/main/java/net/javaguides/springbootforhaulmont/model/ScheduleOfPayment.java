package net.javaguides.springbootforhaulmont.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
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

}
