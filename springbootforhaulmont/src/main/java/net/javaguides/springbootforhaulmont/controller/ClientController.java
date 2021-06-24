package net.javaguides.springbootforhaulmont.controller;

import net.javaguides.springbootforhaulmont.model.Client;
import net.javaguides.springbootforhaulmont.service.ClientServiceInterface;
import net.javaguides.springbootforhaulmont.service.ClientServiceRealisation;
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

    private ClientServiceInterface clientServiceInterface;

    @Autowired
    public ClientController(ClientServiceInterface clientServiceInterface) {
        this.clientServiceInterface = clientServiceInterface;
    }
    @GetMapping("/")
    public String showStartPage(Model model) {
        model.addAttribute("listClients", clientServiceInterface.findAllClient());
        return "index";

    }

    @GetMapping("/clients")
    public String findAll(Model model) {
        List<Client> clients = clientServiceInterface.findAllClient();
        model.addAttribute("clients", clients);
        return "client-list";
    }

    @GetMapping("/client-create")
    public String createClientFrom(Client client) {
        return "client-create";
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
        return "/client-update";
    }

    @PostMapping("/client-update")
    public String updateClient(Client client) {
        clientServiceInterface.saveClient(client);
        return "redirect:/clients";
    }

}
