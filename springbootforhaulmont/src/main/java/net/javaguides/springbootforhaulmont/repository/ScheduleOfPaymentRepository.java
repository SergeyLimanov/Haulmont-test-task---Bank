package net.javaguides.springbootforhaulmont.repository;

import net.javaguides.springbootforhaulmont.model.ScheduleOfPayment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ScheduleOfPaymentRepository extends JpaRepository <ScheduleOfPayment, UUID> {

    List<ScheduleOfPayment> findByOfferOfCreditId(UUID  OfferOfCreditId);

    void deleteAllByOfferOfCredit(UUID id);

}
