package net.javaguides.springbootforhaulmont.controller;

import net.javaguides.springbootforhaulmont.model.Client;
import net.javaguides.springbootforhaulmont.service.ClientServiceRealisation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClientController {

    private ClientServiceRealisation clientService;

    @GetMapping("/clients")
    public String findAll() {
        List<Client> clients = clientService.findAll();
        return 
    }
    
}
