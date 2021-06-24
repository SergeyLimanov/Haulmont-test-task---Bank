package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.Bank;
import net.javaguides.springbootforhaulmont.model.Credit;

import java.util.List;
import java.util.UUID;

public interface CreditServiceInterface {

    public Credit findCreditById(UUID id);

    public List<Credit> findAllCredit();

    public void deleteCreditById(UUID id);

    public Credit saveCredit(Credit credit);
}
