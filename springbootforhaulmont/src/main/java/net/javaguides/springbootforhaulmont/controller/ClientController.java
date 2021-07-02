package net.javaguides.springbootforhaulmont.controller;

import net.javaguides.springbootforhaulmont.model.Client;
import net.javaguides.springbootforhaulmont.service.BankServiceInterface;
import net.javaguides.springbootforhaulmont.service.ClientServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/clients")
public class ClientController {

    private final ClientServiceInterface clientServiceInterface;
    private final BankServiceInterface bankServiceInterface;

    @Autowired
    public ClientController(ClientServiceInterface clientServiceInterface, BankServiceInterface bankServiceInterface) {
        this.clientServiceInterface = clientServiceInterface;
        this.bankServiceInterface = bankServiceInterface;
    }

    @GetMapping("/clients_list/{bankId}")
    public String viewHomePage(@PathVariable("bankId") UUID bankId, Model model) {
        model.addAttribute("listClients", clientServiceInterface.findByBankId(bankId));
        return "/client/client-list";
    }

    @GetMapping("/show_new_client_form/{bankId}")
    public String showNewClientForm(@PathVariable("bankId") UUID bankId, Model model) {
        Client client = new Client();
        client.setBank(bankServiceInterface.findBankById(bankId));
        model.addAttribute("client", client);
        return "client/client-create";
    }

    @PostMapping("/save_client")
    public String saveClient(@ModelAttribute("client") Client client, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return client.getId() == null ? "/client/client-create" : "/client/client-update";
        }
        clientServiceInterface.saveClient(client);
        return String.format("redirect:/clients/clients_list/%s", client.getBank().getId());
    }

    @GetMapping("/show_form_for_update/{clientId}")
    public String showFormForUpdate(@PathVariable("clientId") UUID clientId, Model model) {
        model.addAttribute("client", clientServiceInterface.findClient(clientId));
        return "client/client-update";
    }

    @GetMapping("/delete_client/{clientId}")
    public String deleteClientById(@PathVariable("clientId") UUID clientId) {
        UUID bankId = clientServiceInterface.findClient(clientId).getBank().getId();
        clientServiceInterface.deleteClientById(clientId);
        return String.format("redirect:/clients/clients_list/%s", bankId);
    }
}
