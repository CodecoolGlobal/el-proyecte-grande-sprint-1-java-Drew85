package com.codecool.flightclub.management.service;

import com.codecool.flightclub.management.model.Club;
import com.codecool.flightclub.management.model.Client;
import com.codecool.flightclub.management.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {



    private ClientRepository clientRepository;
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }






    public List<Client> getUsers() {
        return clientRepository.findAll();
    }

    public Client getUser(Long id) {
         return clientRepository.findUserById(id);
    }


    public void addClubToUser(Club club, Client user){
        user.setClub(club);
    }

    public void createUser(Client client) {
        clientRepository.save(client);
    }
}
