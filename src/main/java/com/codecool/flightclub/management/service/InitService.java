package com.codecool.flightclub.management.service;


import com.codecool.flightclub.management.model.Client;
import com.codecool.flightclub.management.model.RoleEntity;
import com.codecool.flightclub.management.repository.ClientRepository;
import com.codecool.flightclub.management.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class InitService {
    private final ClientRepository userRepository;
    private final RoleRepository roleRepository;

    @Autowired
    public InitService(ClientRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }
    public void initServiceDatabase(){
        RoleEntity adminRole = RoleEntity.builder().name("ADMIN").build();
        adminRole = roleRepository.saveAndFlush(adminRole);

        Client admin = Client.builder().name("ADMIN").password("12345").roles(Set.of(adminRole)).build();
        userRepository.save(admin);

    }
}
