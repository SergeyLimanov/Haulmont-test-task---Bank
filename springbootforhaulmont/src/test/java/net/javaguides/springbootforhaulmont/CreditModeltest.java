package net.javaguides.springbootforhaulmont;

import net.javaguides.springbootforhaulmont.model.Credit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class CreditModeltest {

    @Test
    public void percentageShouldBeNull() {
        Credit creditOne = new Credit();

        Assertions.assertEquals(null, creditOne.getCreditPercentage());

    }
}
