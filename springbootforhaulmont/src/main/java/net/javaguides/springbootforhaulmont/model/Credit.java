package net.javaguides.springbootforhaulmont.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table("Credit")
    public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "credit_id")
    private UUID id;

    @Column(name = "limit_of_money")
    private BigDecimal limitOfMoney;

    @Column(name = "credit_percentage")
    private BigDecimal creditPercentage;

    @JoinColumn(name = "bank_id")
    @ManyToOne
    private Bank bank;

    @Column(name = "type_of_crededit")
    public String typeOfCredit;

    @OneToMany(mappedBy = "credit", cascade = CascadeType.ALL) // fetch type by defolt
    private List <OfferOfCredit> offerOfCreditList;

    public Credit() {
    }

    // переопределить ToString?
}
