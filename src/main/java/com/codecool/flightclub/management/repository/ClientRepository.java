package com.codecool.flightclub.management.repository;

import com.codecool.flightclub.management.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findClientById(Long id);

    Client findClientByName(String name);
}
