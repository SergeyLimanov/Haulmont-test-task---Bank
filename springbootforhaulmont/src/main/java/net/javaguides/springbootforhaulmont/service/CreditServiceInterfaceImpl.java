package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.Credit;
import net.javaguides.springbootforhaulmont.repository.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CreditServiceInterfaceImpl implements CreditServiceInterface {
    
    private final CreditRepository creditRepository;

    @Autowired
    public CreditServiceInterfaceImpl(CreditRepository creditRepository) {
        this.creditRepository = creditRepository;
    }

    @Override
    public Credit findCreditById(UUID id) {
        return creditRepository.getOne(id);
    }

    @Override
    public List<Credit> findByBankId(UUID bankId) {
        return creditRepository.findByBankId(bankId);
    }

    @Override
    public void deleteCreditById(UUID id) {
    creditRepository.deleteById(id);
    }

    @Override
    public void saveCredit(Credit credit) { creditRepository.save(credit);
    }
}
