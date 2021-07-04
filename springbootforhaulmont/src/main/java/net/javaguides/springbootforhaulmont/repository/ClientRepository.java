package net.javaguides.springbootforhaulmont.repository;

import net.javaguides.springbootforhaulmont.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository <Client, UUID> {


    List<Client> findByBankId(UUID bankId);
}
