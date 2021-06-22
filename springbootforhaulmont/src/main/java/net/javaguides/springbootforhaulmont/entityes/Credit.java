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
    private UUID id;

    private BigDecimal limitOfMoney;
    private BigDecimal creditPercentage;
    private Bank bank;
    public String typeOfCredit;
    private List <OfferOfCredit> offerOfCreditList;

    public Credit() {
    }
}
