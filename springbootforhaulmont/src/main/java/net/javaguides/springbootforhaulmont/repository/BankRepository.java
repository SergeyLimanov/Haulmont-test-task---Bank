package net.javaguides.springbootforhaulmont.repository;

import net.javaguides.springbootforhaulmont.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BankRepository extends JpaRepository <Bank, UUID> {
    
}
