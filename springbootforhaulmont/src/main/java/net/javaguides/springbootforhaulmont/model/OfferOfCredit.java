package net.javaguides.springbootforhaulmont.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
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
    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;

    @JoinColumn(name = "CREDIT_ID")
    @ManyToOne(cascade = CascadeType.ALL)
    private Credit credit;

    @Column(name = "SUM")
    private BigDecimal sum;

    @ToString.Exclude
    @OneToMany(mappedBy = "offerOfCredit", cascade = CascadeType.ALL, fetch = FetchType.LAZY)  // fetch type by defolt?
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
    @ManyToOne(cascade = CascadeType.ALL)   // fetch type by defolt
    @JoinColumn(name = "BANK_ID")
    private Bank bank;


    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Column(name = "TAKE_DATE_OF_CREDIT")
    private LocalDate takeDate;
}
