package net.javaguides.springbootforhaulmont.model;

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
@Table(name = "OFFER_OF_CREDIT")
    public class OfferOfCredit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OFFER_OF_CREDIT_ID")
    private UUID id;

    @JoinColumn(name = "CLIENT_ID")
    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;

    @JoinColumn(name = "CREDIT_ID")
    @ManyToOne(cascade = CascadeType.ALL)
    private Credit credit;

    @OneToMany(mappedBy = "offerOfCredit", cascade = CascadeType.ALL)  // fetch type by defolt
    private List <ScheduleOfPayment> scheduleOfPayment;


    @Column(name = "NAME_OF_CREDIT")
    private String nameOfCredit;

    @Column(name = "SUM_OF_PERCENT")
    private BigDecimal sumOfPercent;

    @Column(name = "FIRST_PAYMENT")
    private BigDecimal firstPayment;

    @Column(name = "CREDIT_TERM")
    private Integer creditTerm;  //срок кредита

    @ManyToOne(cascade = CascadeType.ALL)   // fetch type by defolt
    @JoinColumn(name = "BANK_ID")
    private Bank bank;


    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Column(name = "TAKE_DATE_OF_CREDIT")
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
