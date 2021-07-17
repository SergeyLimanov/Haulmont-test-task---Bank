package net.javaguides.springbootforhaulmont;

        import net.javaguides.springbootforhaulmont.model.Bank;
        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

class BankModelTest {

    @Test
    public void newBankShouldEntityEquals() {
        Bank firstBank = new Bank();
        firstBank.setName("NewOne");
        Bank secondBank = new Bank();
        secondBank.setName("NewTwo");
        Assertions.assertTrue(firstBank.hashCode() != secondBank.hashCode());
        Assertions.assertNotEquals(firstBank, secondBank);
    }
}



