package com.codecool.flightclub.management.service;

import com.codecool.flightclub.management.model.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClubService {


    private List<Club> clubs;

    @Autowired
    public ClubService() {
        this.clubs = new ArrayList<>();
    }

    public void addToClubs(){
        clubs.add(new Club(BigDecimal.ONE, "Pesti-Repülő-Klub", null, null,1));
        clubs.add(new Club(BigDecimal.TEN,"Dél-Pesti-Klub", null,null,2));
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
}
