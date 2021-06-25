package net.javaguides.springbootforhaulmont.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;


@Entity
@Data
@Table(name = "BANK")
    public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "BANK_ID")
    private UUID id;
    
    @Column(name = "BANK_NAME")
    private String name;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private List<Credit> listOfCredits;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private List<Client> listOfClients;

    public Bank() {
    }
    
    // переопределить ToString?

}
