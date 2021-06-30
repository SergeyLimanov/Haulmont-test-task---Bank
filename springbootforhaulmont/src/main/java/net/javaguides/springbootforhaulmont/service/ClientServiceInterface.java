package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.Client;

import java.util.List;
import java.util.UUID;

public interface ClientServiceInterface {


    Client findClient(UUID id);

    List<Client> findByBankId(UUID bankId);

    void deleteClientById(UUID id);

    void saveClient(Client client);

}
