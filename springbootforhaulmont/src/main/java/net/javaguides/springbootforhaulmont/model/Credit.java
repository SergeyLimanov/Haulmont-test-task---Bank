package net.javaguides.springbootforhaulmont.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
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

    @Column(name = "CREDIT_PERCENTAGE")
    private BigDecimal creditPercentage;

    @JoinColumn(name = "BANK_ID")
    @ManyToOne
    private Bank bank;

    @Column(name = "TYPE_OF_CREDIT")
    public String typeOfCredit;

    @OneToMany(mappedBy = "credit", cascade = CascadeType.ALL) // fetch type by defolt
    private List <OfferOfCredit> offerOfCreditList;

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    // переопределить ToString?
}
