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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public List<ScheduleOfPayment> getScheduleOfPayment() {
        return scheduleOfPayment;
    }

    public void setScheduleOfPayment(List<ScheduleOfPayment> scheduleOfPayment) {
        this.scheduleOfPayment = scheduleOfPayment;
    }

    public String getNameOfCredit() {
        return nameOfCredit;
    }

    public void setNameOfCredit(String nameOfCredit) {
        this.nameOfCredit = nameOfCredit;
    }

    public BigDecimal getSumOfPercent() {
        return sumOfPercent;
    }

    public void setSumOfPercent(BigDecimal sumOfPercent) {
        this.sumOfPercent = sumOfPercent;
    }

    public BigDecimal getFirstPayment() {
        return firstPayment;
    }

    public void setFirstPayment(BigDecimal firstPayment) {
        this.firstPayment = firstPayment;
    }

    public Integer getCreditTerm() {
        return creditTerm;
    }

    public void setCreditTerm(Integer creditTerm) {
        this.creditTerm = creditTerm;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public LocalDate getTakeDate() {
        return takeDate;
    }

    public void setTakeDate(LocalDate takeDate) {
        this.takeDate = takeDate;
    }

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
