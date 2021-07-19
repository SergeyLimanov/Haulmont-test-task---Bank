package net.javaguides.springbootforhaulmont;

import net.javaguides.springbootforhaulmont.model.OfferOfCredit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class ClientRepositoryTest {

    @Test
    public void ShouldBeDifferentId(){
        OfferOfCredit offerFirst = new OfferOfCredit();
        offerFirst.setNameOfCredit("Hello");
        OfferOfCredit offerSecond = new OfferOfCredit();
        offerSecond.setNameOfCredit("GoodBye");

        Assertions.assertFalse(offerFirst.getId() != offerSecond.getId());


    }
}
