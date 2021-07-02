package net.javaguides.springbootforhaulmont.repository;

import net.javaguides.springbootforhaulmont.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BankRepository extends JpaRepository<Bank, UUID> {
    
}
