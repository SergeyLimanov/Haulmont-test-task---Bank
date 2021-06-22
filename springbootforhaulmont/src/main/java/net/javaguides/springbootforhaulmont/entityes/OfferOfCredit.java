package net.javaguides.springbootforhaulmont.entityes;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;


@Entity
@Data
@Table("offer_of_credit")
    public class OfferOfCredit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private Client client;
    private Credit credit;
    private List <ScheduleOfPayment> scheduleOfPayment;
    private String nameOfCredit;
    private BigDecimal sumOfPercent;
    private BigDecimal firstPayment;
    private Integer creditTerm;  //срок кредита
    private Bank bank;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate takeDate;


    public OfferOfCredit() {
    }

    public OfferOfCredit(UUID id, Client client, Credit credit, List<ScheduleOfPayment> scheduleOfPayment, String nameOfCredit, BigDecimal sumOfPercent, BigDecimal firstPayment, Integer creditTerm, Bank bank, LocalDate takeDate) {
        this.id = id;
        this.client = client;
        this.credit = credit;
        this.scheduleOfPayment = scheduleOfPayment;
        this.nameOfCredit = nameOfCredit;
        this.sumOfPercent = sumOfPercent;
        this.firstPayment = firstPayment;
        this.creditTerm = creditTerm;
        this.bank = bank;
        this.takeDate = takeDate;
    }
}
