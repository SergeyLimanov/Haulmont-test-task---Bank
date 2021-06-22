package net.javaguides.springbootforhaulmont.entityes;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table("Client")
    public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String fio;
    private int phoneNumber;
    private String email;
    private String passportNumber;

    private Bank bank;
    private Credit credit;
    private OfferOfCredit offerOfCredit;

    public Client() {
    }
}
