package net.javaguides.springbootforhaulmont.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Getter
@Setter
@ToString
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

    @Column(name = "REPAYMENT_REMAINS")
    private BigDecimal remains;

    @ManyToOne
    @JoinColumn(name = "OFFER_OF_CREDIT_ID")
    private OfferOfCredit offerOfCredit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ScheduleOfPayment that = (ScheduleOfPayment) o;

        return id != null && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfPayment, amountOfPayment, amountOfPaymentPerBody, amountOfRepaymentPercent, remains);
    }
}
