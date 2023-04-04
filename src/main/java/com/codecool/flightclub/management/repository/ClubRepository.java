package com.codecool.flightclub.management.repository;

import com.codecool.flightclub.management.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends JpaRepository<Club, Integer> {
}
