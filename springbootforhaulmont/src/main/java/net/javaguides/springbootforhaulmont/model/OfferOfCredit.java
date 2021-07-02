package net.javaguides.springbootforhaulmont.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "OFFER_OF_CREDIT")
public class OfferOfCredit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OFFER_OF_CREDIT_ID")
    private UUID id;

    @ToString.Exclude
    @JoinColumn(name = "CLIENT_ID")
    @ManyToOne(cascade = CascadeType.MERGE)
    private Client client;

    @JoinColumn(name = "CREDIT_ID")
    @ManyToOne(cascade = CascadeType.MERGE)
    private Credit credit;

    @Column(name = "SUM")
    private BigDecimal sum;

    @ToString.Exclude
    @OneToMany(mappedBy = "offerOfCredit", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List <ScheduleOfPayment> scheduleOfPayment;

    @Column(name = "NAME_OF_CREDIT")
    private String nameOfCredit;

    @Column(name = "SUM_OF_PERCENT")
    private BigDecimal sumOfPercent;

    @Column(name = "FIRST_PAYMENT")
    private BigDecimal firstPayment;

    @Column(name = "CREDIT_TERM")
    private Integer creditTerm;  //срок кредита

    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "BANK_ID")
    private Bank bank;

    @Column(name = "TAKE_DATE_OF_CREDIT")
    private String takeDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        OfferOfCredit that = (OfferOfCredit) o;

        return id != null && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sum, nameOfCredit, sumOfPercent, firstPayment, creditTerm, takeDate);
    }
}
