package net.javaguides.springbootforhaulmont.repository;

import net.javaguides.springbootforhaulmont.model.Credit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CreditRepository extends JpaRepository <Credit, UUID> {
}
