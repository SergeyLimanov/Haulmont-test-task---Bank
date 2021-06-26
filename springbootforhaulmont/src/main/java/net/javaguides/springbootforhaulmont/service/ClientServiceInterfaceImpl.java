package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.Client;
import net.javaguides.springbootforhaulmont.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientServiceInterfaceImpl implements ClientServiceInterface {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceInterfaceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public Client findClient(UUID clientId) {
        return clientRepository.getOne(clientId);
    }

    @Override
    public List<Client> findAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public void deleteClientById(UUID id){
        clientRepository.deleteById(id);
    }

    @Override
     public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> findByBankId(UUID bankId) {
        return clientRepository.findByBankId(bankId);
    }
}

