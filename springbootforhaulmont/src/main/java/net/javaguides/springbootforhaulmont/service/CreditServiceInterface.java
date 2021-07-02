package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.Credit;

import java.util.List;
import java.util.UUID;

public interface CreditServiceInterface {

    Credit findCreditById(UUID id);

    List<Credit> findByBankId(UUID bankId);

    void deleteCreditById(UUID id);

    void saveCredit(Credit credit);
}
