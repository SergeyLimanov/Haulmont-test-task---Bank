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
@Table(name = "Offer_of_credit")
    public class OfferOfCredit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "offer_of_credit_id")
    private UUID id;

    @JoinColumn(name = "Client_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;

    @JoinColumn(name = "Credit_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Credit credit;

    @OneToMany(mappedBy = "offerOfCredit", cascade = CascadeType.ALL)  // fetch type by defolt
    private List <ScheduleOfPayment> scheduleOfPayment;


    @Column(name = "name_of_credit")
    private String nameOfCredit;

    @Column(name = "sum_of_percent")
    private BigDecimal sumOfPercent;

    @Column(name = "first_payment")
    private BigDecimal firstPayment;

    @Column(name = "credit_term")
    private Integer creditTerm;  //срок кредита

    @ManyToOne(cascade = CascadeType.ALL)   // fetch type by defolt
    @JoinColumn(name = "bank_id")
    private Bank bank;


    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Column(name = "take_date_of_credit")
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
