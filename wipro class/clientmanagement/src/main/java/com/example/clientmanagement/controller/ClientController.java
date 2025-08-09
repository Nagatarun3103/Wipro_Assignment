package com.example.clientmanagement.controller;

import com.example.clientmanagement.entity.Client;
import com.example.clientmanagement.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listClients", clientService.getAllClients());
        return "index";
    }

    @GetMapping("/showNewClientForm")
    public String showNewClientForm(Model model) {
        model.addAttribute("client", new Client());
        return "new_client";
    }

    @PostMapping("/saveClient")
    public String saveClient(@ModelAttribute("client") Client client) {
        clientService.saveClient(client);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        Client client = clientService.getClientById(id);
        model.addAttribute("client", client);
        return "update_client";
    }

    @GetMapping("/deleteClient/{id}")
    public String deleteClient(@PathVariable(value = "id") long id) {
        clientService.deleteClientById(id);
        return "redirect:/";
    }
}
