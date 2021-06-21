package net.javaguides.springbootforhaulmont.model;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class OfferOfCredit {
    private UUID id;

    private Client client;
    private Credit credit;
    private BigDecimal amountOfCredit;
    private List <ScheduleOfPayment> scheduleOfPayment;
    private String typeOfCredit;
    private BigDecimal sumOfPercent;
    private BigDecimal firstPayment;
    private Integer creditTerm;  //срок кредита
    private Bank bank;







}
