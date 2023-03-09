package com.codecool.flightclub.management.controller;

import com.codecool.flightclub.management.model.Club;
import com.codecool.flightclub.management.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/club")
public class ClubController {
    private ClubService clubService;


    @Autowired
    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    @GetMapping
    public List<Club> getAllClubs(){
        return clubService.getClubs();
    }

    @GetMapping("/{id}")
    public Club getClub(@PathVariable int id){
        return clubService.getClub(id);
    }

    @PostMapping
    public void addClub(){
        clubService.addToClubs();
    }

    @PutMapping("/{id}")
    public void updateClubName(@PathVariable String id, @RequestBody String name){

    }

}
