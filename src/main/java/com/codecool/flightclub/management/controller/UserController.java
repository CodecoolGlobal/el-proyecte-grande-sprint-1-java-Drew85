package com.codecool.flightclub.management.controller;

import com.codecool.flightclub.management.model.Club;
import com.codecool.flightclub.management.model.User;
import com.codecool.flightclub.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")

public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUsers(@PathVariable int id){
        return userService.getUsers(id);
    }

    @PostMapping
    public void AddUser(){
        userService.AddNewMember();
    }

    @PostMapping("/add-club")
    public ResponseEntity<Void> addClubToUser(@RequestBody Club club) {
        User user = new User("Béla", 3 , null);
        userService.addClubToUser(club, user);
        return ResponseEntity.ok().build();
    }


}
