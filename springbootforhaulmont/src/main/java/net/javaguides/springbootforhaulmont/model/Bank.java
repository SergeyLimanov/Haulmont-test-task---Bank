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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Credit> getListOfCredits() {
        return listOfCredits;
    }

    public void setListOfCredits(List<Credit> listOfCredits) {
        this.listOfCredits = listOfCredits;
    }

    public List<Client> getListOfClients() {
        return listOfClients;
    }

    public void setListOfClients(List<Client> listOfClients) {
        this.listOfClients = listOfClients;
    }

    public Bank() {
    }
    
    // переопределить ToString?

}
