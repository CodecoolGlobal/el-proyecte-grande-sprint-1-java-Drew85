package com.codecool.flightclub.management.plane_controller;

import com.codecool.flightclub.management.model.Club;
import com.codecool.flightclub.management.service.ClubCreator;
import com.codecool.flightclub.management.service.ClubStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/club")
public class ClubController {
    private ClubCreator clubCreator;
    private ClubStorage clubStorage;

    @Autowired
    public ClubController(ClubCreator clubCreator, ClubStorage clubStorage) {
        this.clubCreator = clubCreator;
        this.clubStorage = clubStorage;
    }

    @GetMapping
    public List<Club> getAllClubs(){
        return clubStorage.getClubs();
    }

    @PostMapping
    public Club addClub(@RequestBody Club club){
        return clubStorage.addClubs(club);
    }


}
