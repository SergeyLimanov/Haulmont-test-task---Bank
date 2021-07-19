package net.javaguides.springbootforhaulmont;

import net.javaguides.springbootforhaulmont.model.Credit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

 class CreditModelTest {

    @Test
    public void percentageShouldBeNull() {
        Credit creditOne = new Credit();

        Assertions.assertEquals(null, creditOne.getCreditPercentage());

    }
}
