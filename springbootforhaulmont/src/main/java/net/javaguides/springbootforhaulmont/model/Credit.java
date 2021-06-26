package net.javaguides.springbootforhaulmont.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "CREDIT")
    public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CREDIT_ID")
    private UUID id;

    @Column(name = "LIMIT_OF_MONEY")
    private BigDecimal limitOfMoney;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getLimitOfMoney() {
        return limitOfMoney;
    }

    public void setLimitOfMoney(BigDecimal limitOfMoney) {
        this.limitOfMoney = limitOfMoney;
    }

    public BigDecimal getCreditPercentage() {
        return creditPercentage;
    }

    public void setCreditPercentage(BigDecimal creditPercentage) {
        this.creditPercentage = creditPercentage;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public String getTypeOfCredit() {
        return typeOfCredit;
    }

    public void setTypeOfCredit(String typeOfCredit) {
        this.typeOfCredit = typeOfCredit;
    }

    public List<OfferOfCredit> getOfferOfCreditList() {
        return offerOfCreditList;
    }

    public void setOfferOfCreditList(List<OfferOfCredit> offerOfCreditList) {
        this.offerOfCreditList = offerOfCreditList;
    }

    @Column(name = "CREDIT_PERCENTAGE")
    private BigDecimal creditPercentage;

    @JoinColumn(name = "BANK_ID")
    @ManyToOne
    private Bank bank;

    @Column(name = "TYPE_OF_CREDIT")
    public String typeOfCredit;

    @OneToMany(mappedBy = "credit", cascade = CascadeType.ALL) // fetch type by defolt
    private List <OfferOfCredit> offerOfCreditList;

    public Credit() {
    }

    // переопределить ToString?
}
