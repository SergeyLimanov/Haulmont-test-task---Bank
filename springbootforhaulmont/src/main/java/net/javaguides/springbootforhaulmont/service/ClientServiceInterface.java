package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.Client;

import java.util.List;
import java.util.UUID;

public interface ClientServiceInterface {

    public Client findClient(UUID clientId);

    public List<Client> findAllClient();

    public void deleteClientById(UUID id);

    public Client saveClient(Client client);

    List<Client> findByBankId(UUID bankId);
}
