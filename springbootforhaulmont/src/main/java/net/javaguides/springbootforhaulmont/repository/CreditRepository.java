package net.javaguides.springbootforhaulmont.repository;

import net.javaguides.springbootforhaulmont.entityes.Bank;
import net.javaguides.springbootforhaulmont.entityes.Client;
import net.javaguides.springbootforhaulmont.entityes.Credit;
import net.javaguides.springbootforhaulmont.entityes.OfferOfCredit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CreditRepository extends JpaRepository <Credit, UUID> {



}
