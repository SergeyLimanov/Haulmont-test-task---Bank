package net.javaguides.springbootforhaulmont.repository;

import net.javaguides.springbootforhaulmont.entityes.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityNotFoundException;
import java.util.UUID;

public interface BankRepository extends JpaRepository <Bank, UUID> {
    
}
