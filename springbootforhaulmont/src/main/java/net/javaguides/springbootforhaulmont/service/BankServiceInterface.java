package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.Bank;
import net.javaguides.springbootforhaulmont.model.Client;

import java.util.List;
import java.util.UUID;

public interface BankServiceInterface {

    public Bank findBankById(UUID id);

    public List<Bank> findAllBank();

    public void deleteBankById(UUID id);

    public Bank saveBank(Bank bank);
}
