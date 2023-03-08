package com.codecool.flightclub.management.service;

import com.codecool.flightclub.management.model.Club;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ClubCreator {


    public Club createClub(Club club){
        return new Club(BigDecimal.ONE, "Budaörs-Klub", club.getUsers(), club.getPlanes());
    }
}
