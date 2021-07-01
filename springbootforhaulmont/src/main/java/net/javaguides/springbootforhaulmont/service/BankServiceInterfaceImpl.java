package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.Bank;
import net.javaguides.springbootforhaulmont.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BankServiceInterfaceImpl implements BankServiceInterface {

    private final BankRepository bankRepository;

    @Autowired
    public BankServiceInterfaceImpl(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @Nullable
    @Override
    public Bank findBankById(UUID id) {
        return bankRepository.findById(id).orElse(null);
    }

    @Override
    public List<Bank> findAllBank() {
        return bankRepository.findAll();
    }

    @Override
    public void deleteBankById(UUID id) {
    bankRepository.deleteById(id);
    }

    @Override
    public Bank saveBank(Bank bank) {
        return bankRepository.save(bank);
    }
}
