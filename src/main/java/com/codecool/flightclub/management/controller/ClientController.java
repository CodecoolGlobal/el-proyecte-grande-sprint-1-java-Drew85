package com.codecool.flightclub.management.controller;

import com.codecool.flightclub.management.model.Club;
import com.codecool.flightclub.management.model.Client;
import com.codecool.flightclub.management.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class ClientController {
    private ClientService userService;

    @Autowired
    public ClientController(ClientService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<Client> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public Client getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping
    public void createUser(@RequestBody Client client){
        userService.createUser(client);
    }

    @PutMapping("/{id}")
    public void editUser(@PathVariable Long id, @RequestParam(name = "name") String newName) {

    }
    
    @PostMapping("/add-club")
    public ResponseEntity<Void> addClubToUser(@RequestBody Club club, Client user) {
        userService.addClubToUser(club, user);
        return ResponseEntity.ok().build();
    }

}
