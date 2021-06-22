package net.javaguides.springbootforhaulmont.entityes;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;



@Entity
@Data
@Table("schedule_of_payment")
    public class ScheduleOfPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private LocalDate dateOfPayment;
    private BigDecimal amountOfPayment;
    private BigDecimal amountOfPaymentPerBody;
    private BigDecimal amountOfRepaymentPercent;
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
