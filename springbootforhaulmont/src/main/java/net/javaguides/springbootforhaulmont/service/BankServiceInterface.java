package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.Bank;

import java.util.List;
import java.util.UUID;

public interface BankServiceInterface {

    Bank findBankById(UUID id);

    List<Bank> findAllBank();

    void deleteBankById(UUID id);

    void saveBank(Bank bank);

}
