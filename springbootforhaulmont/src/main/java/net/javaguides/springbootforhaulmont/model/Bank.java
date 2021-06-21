package net.javaguides.springbootforhaulmont.model;

import java.util.List;
import java.util.UUID;

public class Bank {
    private UUID id;
    private List<Credit> listOfCredits;
    private List<Client> listOfClients;
}
