package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.OfferOfCredit;

import java.util.List;
import java.util.UUID;

public interface OfferOfCreditInterface {

    OfferOfCredit findOfferOfCreditById(UUID id);

    List <OfferOfCredit> findByClientId (UUID clientId);

    void deleteOfferOfCreditById (UUID id);

    void saveOfferOfCredit (OfferOfCredit offerOfCredit);
}


