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
    @Column (name = "Bank_id")
    private UUID id;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private List<Credit> listOfCredits;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private List<Client> listOfClients;

    public Bank() {
    }

}
