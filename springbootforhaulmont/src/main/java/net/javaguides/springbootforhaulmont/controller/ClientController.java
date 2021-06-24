package net.javaguides.springbootforhaulmont.controller;

import net.javaguides.springbootforhaulmont.model.Client;
import net.javaguides.springbootforhaulmont.service.ClientServiceInterface;
import net.javaguides.springbootforhaulmont.service.ClientServiceRealisation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ClientController {

    private ClientServiceInterface clientServiceInterface;

    @Autowired
    public ClientController(ClientServiceInterface clientServiceInterface) {
        this.clientServiceInterface = clientServiceInterface;
    }

    @GetMapping("/clients")
    public String findAll(Model model) {
        List<Client> clients = clientServiceInterface.findAllClient();
        model.addAttribute("clients", clients);
        return "clients-list";
    }

    @GetMapping("/client-create")
    public String createClientFrom(Client client) {
        return "client-create";
    }

    @PostMapping
    public String createClient(Client client) {
        clientServiceInterface.saveClient(client);
        return "redirect:/clients";
    }
    
}
