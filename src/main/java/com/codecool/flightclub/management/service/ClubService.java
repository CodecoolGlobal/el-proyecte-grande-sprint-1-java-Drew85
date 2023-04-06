package com.codecool.flightclub.management.service;

import com.codecool.flightclub.management.model.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ClubService {

    private List<Club> clubs;

    @Autowired
    public ClubService() {
        this.clubs = new ArrayList<>();
    }

    public void addToClubs(){
    }


    public List<Club> getClubs() {
        return clubs;
    }

    public Club getClub(int id) {
        for (Club club : clubs) {
            if (club.getId() == id){
                return club;
            }
        }
        return null;
    }

    public void updateName(int id, String name) {
        for (Club club : clubs) {
            if (club.getId() == id){
                club.setName(name);
            }
        }
    }

    public void deleteClub(int id) {
        clubs.removeIf(club -> club.getId() == id);
    }

}
