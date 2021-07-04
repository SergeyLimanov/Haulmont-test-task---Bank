package net.javaguides.springbootforhaulmont.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@Table(name = "BANK")
public class Bank {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "BANK_ID")
    private UUID id;

    @Column(name = "BANK_NAME")
    private String name;

    @ToString.Exclude
    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Credit> listOfCredits;

    @ToString.Exclude
    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Client> listOfClients;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Bank bank = (Bank) o;

        return id != null && id.equals(bank.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
