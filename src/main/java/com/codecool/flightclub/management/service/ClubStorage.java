package com.codecool.flightclub.management.service;

import com.codecool.flightclub.management.model.Club;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubStorage {
    List<Club> clubs;

    public ClubStorage(List<Club> clubs) {
        this.clubs = clubs;
    }

    public Club addClubs(Club club) {
        clubs.add(club);
        return club;
    }

    public List<Club> getClubs() {
        return clubs;
    }
}
