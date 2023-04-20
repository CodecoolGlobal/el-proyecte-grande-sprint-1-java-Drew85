package com.codecool.flightclub.management.controller;

import com.codecool.flightclub.management.model.Client;
import com.codecool.flightclub.management.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/login")
public class LoginController {
    private ClientService clientService;

    @Autowired
    public LoginController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public String login(){
        return "OK";
    }

    @GetMapping
    public Client getMe(Authentication authentication){

        return clientService.getUser(authentication.getName());
    }
}
