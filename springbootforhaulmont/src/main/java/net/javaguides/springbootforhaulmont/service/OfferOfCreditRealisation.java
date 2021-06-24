package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.Client;
import net.javaguides.springbootforhaulmont.model.OfferOfCredit;
import net.javaguides.springbootforhaulmont.repository.ClientRepository;
import net.javaguides.springbootforhaulmont.repository.OfferOfCreditRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class OfferOfCreditRealisation implements OfferOfCreditInterface{
    
    private final OfferOfCreditRepository offerOfCreditRepository;

    @Autowired
    public OfferOfCreditRealisation(OfferOfCreditRepository offerOfCreditRepository) {
        this.offerOfCreditRepository = offerOfCreditRepository;
    }

    @Override
    public OfferOfCredit findOfferOfCreditById(UUID id) {
        return offerOfCreditRepository.getOne(id);
    }

    @Override
    public List<OfferOfCredit> findAllOfferOfCredit() {
        return offerOfCreditRepository.findAll();
    }

    @Override
    public void deleteOfferOfCreditById(UUID id) {
        offerOfCreditRepository.deleteById(id);

    }

    @Override
    public OfferOfCredit saveOfferOfCredit(OfferOfCredit offerOfCredit) {
        return offerOfCreditRepository.save(offerOfCredit);
    }
}
