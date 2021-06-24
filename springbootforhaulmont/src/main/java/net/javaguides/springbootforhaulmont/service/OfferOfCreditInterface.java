package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.Credit;
import net.javaguides.springbootforhaulmont.model.OfferOfCredit;

import java.util.List;
import java.util.UUID;

public interface OfferOfCreditInterface {


    public OfferOfCredit findOfferOfCreditById(UUID id);

    public List<OfferOfCredit> findAllOfferOfCredit();

    public void deleteOfferOfCreditById(UUID id);

    public OfferOfCredit saveOfferOfCredit(OfferOfCredit offerOfCredit);
}


