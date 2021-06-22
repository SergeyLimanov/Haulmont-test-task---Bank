package net.javaguides.springbootforhaulmont.entityes;

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
    @Column(name = "Credit_id")
    private UUID id;

    @Column(name = "Credit_limit_of_money")
    private BigDecimal limitOfMoney;

    @Column(name = "Client_credit_percentage")
    private BigDecimal creditPercentage;

    @JoinColumn(name = "Bank_id")
    @ManyToOne
    private Bank bank;

    @Column(name = "Credit_type_of_crededit")
    public String typeOfCredit;

    @OneToMany(mappedBy = "credit", cascade = CascadeType.ALL) // fetch type by defolt
    private List <OfferOfCredit> offerOfCreditList;

    public Credit() {
    }
}
