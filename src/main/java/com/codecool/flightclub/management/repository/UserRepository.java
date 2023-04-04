package com.codecool.flightclub.management.repository;

import com.codecool.flightclub.management.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Client, Integer> {
}
