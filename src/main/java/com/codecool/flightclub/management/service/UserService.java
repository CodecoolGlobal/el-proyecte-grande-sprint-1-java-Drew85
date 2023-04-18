package com.codecool.flightclub.management.service;

import com.codecool.flightclub.management.model.Club;
import com.codecool.flightclub.management.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private List<Client> clients;

    @Autowired
    public UserService(List<Client> clients) {
        this.clients = clients;
    }

    public List<Client> getUsers() {
        return clients;
    }

    public Client getUser(int id) {
        for (Client client : clients) {
            if (client.getId() == id){
                return client;
            }
        }
        return null;
    }



    public void editUser(int id, String newName) {
        getUser(id).setName(newName);
    }

    public void deleteUser(int id) {
        clients.remove(getUser(id));
    }

    public void addClubToUser(Club club, Client client){
        client.setClub(club);
    }
    
}
