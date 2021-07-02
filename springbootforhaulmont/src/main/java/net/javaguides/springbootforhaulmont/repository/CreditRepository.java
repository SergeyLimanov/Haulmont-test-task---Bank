package net.javaguides.springbootforhaulmont.repository;

import net.javaguides.springbootforhaulmont.model.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CreditRepository extends JpaRepository <Credit, UUID> {



}
