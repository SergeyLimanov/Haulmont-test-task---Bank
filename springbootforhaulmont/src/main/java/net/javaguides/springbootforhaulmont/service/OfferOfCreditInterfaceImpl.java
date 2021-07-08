package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.OfferOfCredit;
import net.javaguides.springbootforhaulmont.repository.OfferOfCreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OfferOfCreditInterfaceImpl implements OfferOfCreditInterface{

    private final OfferOfCreditRepository offerOfCreditRepository;

    @Autowired
    public OfferOfCreditInterfaceImpl(OfferOfCreditRepository offerOfCreditRepository) {
        this.offerOfCreditRepository = offerOfCreditRepository;
    }

    @Nullable
    @Override
    public OfferOfCredit findOfferOfCreditById(UUID id) {
        return offerOfCreditRepository.findById(id).orElse(null);
    }




    @Override
    public List <OfferOfCredit> findByClientId(UUID clientId) {
        return offerOfCreditRepository.findByClientId(clientId);
    }

    @Override
    public void deleteOfferOfCreditById(UUID id) {
        offerOfCreditRepository.deleteById(id);

    }

    @Override
    public void saveOfferOfCredit(OfferOfCredit offerOfCredit) {
        offerOfCreditRepository.save(offerOfCredit);
    }
}
