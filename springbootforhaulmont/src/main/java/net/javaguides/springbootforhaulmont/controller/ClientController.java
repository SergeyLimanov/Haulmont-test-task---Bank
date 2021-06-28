package net.javaguides.springbootforhaulmont.controller;

import net.javaguides.springbootforhaulmont.model.Client;
import net.javaguides.springbootforhaulmont.service.ClientServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/clients")
public class ClientController {

    private final ClientServiceInterface clientServiceInterface;

    @Autowired
    public ClientController(ClientServiceInterface clientServiceInterface) {
        this.clientServiceInterface = clientServiceInterface;
    }

    @GetMapping("/clients_list")
    public String viewHomePage(Model model) {
        model.addAttribute("listClients", clientServiceInterface.findAllClient());
        return "/client/client-list";
    }

    @GetMapping("/show_new_client_form")
    public String showNewClientForm(Model model) {
        model.addAttribute("client", new Client());
        return "client/client-create";
    }

    @PostMapping("/save_client")
    public String saveClient(@ModelAttribute("client") Client client) {
        clientServiceInterface.saveClient(client);
        return "redirect:/clients/clients_list";
    }

    @GetMapping("/show_form_for_update/{clientId}")
    public String showFormForUpdate(@PathVariable("clientId") UUID clientId, Model model) {
        model.addAttribute("client", clientServiceInterface.findClient(clientId));
        return "client/client-update";
    }

    @GetMapping("/delete_client/{clientId}")
    public String deleteClientById(@PathVariable("clientId") UUID clientId) {
        clientServiceInterface.deleteClientById(clientId);
        return "redirect:/clients/clients_list";
    }
}
