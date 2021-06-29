package net.javaguides.springbootforhaulmont.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Data
@Table(name = "OFFER_OF_CREDIT")
    public class OfferOfCredit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OFFER_OF_CREDIT_ID")
    private UUID id;

    public List<ScheduleOfPayment> getScheduleOfPayment() {
        return scheduleOfPayment;
    }

    public void setScheduleOfPayment(List<ScheduleOfPayment> scheduleOfPayment) {
        this.scheduleOfPayment = scheduleOfPayment;
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

}
