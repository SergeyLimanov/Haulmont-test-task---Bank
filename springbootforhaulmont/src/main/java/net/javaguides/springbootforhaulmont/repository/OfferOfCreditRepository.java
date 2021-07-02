package net.javaguides.springbootforhaulmont.repository;

import net.javaguides.springbootforhaulmont.model.OfferOfCredit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface OfferOfCreditRepository extends JpaRepository<OfferOfCredit, UUID> {
    OfferOfCredit findByClientId(UUID clientId);
}
