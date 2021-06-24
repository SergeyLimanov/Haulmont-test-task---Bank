package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.Client;
import net.javaguides.springbootforhaulmont.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientServiceRealisation implements ClientServiceInterface {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceRealisation(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client findClientById(UUID id) {
        return clientRepository.getOne(id);
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
}
