package net.javaguides.springbootforhaulmont.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;


@Entity
@Data
@Table(name = "Bank")
    public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "bank_id")
    private UUID id;
    
    @Column(name = "bank_name")
    private String name;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private List<Credit> listOfCredits;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private List<Client> listOfClients;

    public Bank() {
    }
    
    // переопределить ToString?

}
