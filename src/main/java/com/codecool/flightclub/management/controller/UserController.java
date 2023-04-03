package com.codecool.flightclub.management.controller;

import com.codecool.flightclub.management.model.Client;
import com.codecool.flightclub.management.model.Club;
import com.codecool.flightclub.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<Client> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public Client getUser(@PathVariable int id){
        return userService.getUser(id);
    }

    @PostMapping("/new-user")
    public void AddUser(@RequestParam(name = "name") String name){
        userService.AddNewUser(name);
    }

    @PutMapping("/{id}")
    public void editUser(@PathVariable int id, @RequestParam(name = "name") String newName) {
        userService.editUser(id, newName);
    }
    
    @PostMapping("/add-club")
    public ResponseEntity<Void> addClubToUser(@RequestBody Club club) {
        Client client = new Client("Béla", 3 , null);
        userService.addClubToUser(club, client);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }
}
