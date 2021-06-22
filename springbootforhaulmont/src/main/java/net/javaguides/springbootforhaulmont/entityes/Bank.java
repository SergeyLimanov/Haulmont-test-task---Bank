package net.javaguides.springbootforhaulmont.entityes;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;


@Entity
@Data
@Table("Bank")
    public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private List<Credit> listOfCredits;
    private List<Client> listOfClients;

    public Bank() {
    }

}
