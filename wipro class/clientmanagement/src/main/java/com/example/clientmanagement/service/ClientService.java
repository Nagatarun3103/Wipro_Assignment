package com.example.clientmanagement.service;

import com.example.clientmanagement.entity.Client;
import com.example.clientmanagement.repository.ClientRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }
}
