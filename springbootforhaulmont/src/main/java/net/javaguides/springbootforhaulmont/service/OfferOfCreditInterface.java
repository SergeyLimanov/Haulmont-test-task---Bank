package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.OfferOfCredit;

import java.util.UUID;

public interface OfferOfCreditInterface {

    OfferOfCredit findOfferOfCreditById(UUID id);

    OfferOfCredit findByClientId (UUID clientId);

    void deleteOfferOfCreditById (UUID id);

    void saveOfferOfCredit (OfferOfCredit offerOfCredit);
}


