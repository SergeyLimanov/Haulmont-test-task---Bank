package net.javaguides.springbootforhaulmont.repository;

import net.javaguides.springbootforhaulmont.entityes.OfferOfCredit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface OfferOfCreditRepository extends JpaRepository <OfferOfCredit, UUID> {
    List<OfferOfCredit> findByClientId(UUID clientId);
}
