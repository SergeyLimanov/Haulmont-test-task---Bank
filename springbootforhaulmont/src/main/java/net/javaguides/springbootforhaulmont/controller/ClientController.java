package net.javaguides.springbootforhaulmont.controller;

import net.javaguides.springbootforhaulmont.model.Bank;
import net.javaguides.springbootforhaulmont.model.Client;
import net.javaguides.springbootforhaulmont.service.BankServiceInterface;
import net.javaguides.springbootforhaulmont.service.ClientServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@Controller
public class ClientController {

    private final ClientServiceInterface clientServiceInterface;

    @Autowired
    public ClientController(ClientServiceInterface clientServiceInterface, BankServiceInterface bankServiceInterface) {
        this.clientServiceInterface = clientServiceInterface;
    }



    @GetMapping("/")
    public String showStartPage(Model model) {
        model.addAttribute("listClients", clientServiceInterface.findAllClient());
        return "Client/client-list";

    }

    @GetMapping("/clients")
    public String findAll(Model model) {
        List<Client> clients = clientServiceInterface.findAllClient();
        model.addAttribute("clients", clients);
        return "Client/client-list";
    }

    @GetMapping("/client-create")
    public String createClientFrom(Client client) {
        return "Client/client-create";
    }

    @PostMapping("/client-create")
    public String createClient(Client client) {
        clientServiceInterface.saveClient(client);
        return "redirect:/clients";
    }

    @GetMapping("client-delete/{id}")
    public String deleteClient(@PathVariable("id") UUID id) {
        clientServiceInterface.deleteClientById(id);
        return "redirect:/clients";
    }

    @GetMapping("client-update/{id}")
    public String updateClientForm(@PathVariable("id") UUID id, Model model) {
        Client client = clientServiceInterface.findClientById(id);
        model.addAttribute("client", client);
        return "Client/client-update";
    }

    @PostMapping("/client-update")
    public String updateClient(Client client) {
        clientServiceInterface.saveClient(client);
        return "redirect:/clients";
    }
}
