package net.javaguides.springbootforhaulmont.controller;

import net.javaguides.springbootforhaulmont.model.Client;
import net.javaguides.springbootforhaulmont.service.BankServiceInterface;
import net.javaguides.springbootforhaulmont.service.ClientServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @PostMapping("/save_client/")
    public String saveClient(@ModelAttribute("client") Client client, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return client.getId() == null ? "/client/client-create" : "/client/client-create";
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
    public String deleteClientByIdB(@PathVariable("clientId") UUID clientId) {
        UUID bankId = clientServiceInterface.findClient(clientId).getBank().getId();
        clientServiceInterface.deleteClientById(clientId);
        return String.format("redirect:/clients/clients_list/%s", bankId);
    }






   //// @GetMapping("/")
   // public String showStartPage(Model model) {
   //     model.addAttribute("listClients", clientServiceInterface.findAllClient());
   //     return "client/client-list";
//
   // }
//
   // @GetMapping("/clients")
   // public String findAll(Model model) {
   //     List<Client> clients = clientServiceInterface.findAllClient();
   //     model.addAttribute("clients", clients);
   //     return "client/client-list";
   // }
//
   // @GetMapping("/client-create")
   // public String createClientFrom(Client client) {
   //     return "client/client-create";
   // }
//
   // @PostMapping("/client-create")
   // public String createClient(Client client) {
   //     clientServiceInterface.saveClient(client);
   //     return "redirect:/clients";
   // }
//
   // @GetMapping("client-delete/{id}")
   // public String deleteClient(@PathVariable("id") UUID id) {
   //     clientServiceInterface.deleteClientById(id);
   //     return "redirect:/clients";
   // }

    //@GetMapping("client-update/{id}")
    //public String updateClientForm(@PathVariable("id") UUID id, Model model) {
    //    Client client = clientServiceInterface.findClient(id);
    //    model.addAttribute("client", client);
    //    return "client/client-update";
    //}
//
    //@PostMapping("/client-update")
   // public String updateClient(Client client) {
    //    clientServiceInterface.saveClient(client);
    //    return "redirect:/clients";
    //}
}
