package com.codecool.flightclub.management.service;

import com.codecool.flightclub.management.model.Club;
import com.codecool.flightclub.management.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {

    private ClubRepository clubRepo;

    @Autowired
    public ClubService(ClubRepository clubRepo) {
        this.clubRepo = clubRepo;
    }

    public void addToClubs(Club club){
        clubRepo.save(club);
        // clubs.add(new Club(BigDecimal.valueOf(4200), "Pesti-Repülő-Klub", null, null,1));
        // clubs.add(new Club(BigDecimal.valueOf(6310),"Dél-Pesti-Klub", null,null,2));
    }


    public List<Club> getClubs() {
        return clubRepo.findAll();
    }

    public Club getClub(int id) {
        return clubRepo.findById(id).get();
    }

    public void updateName(int id, String name) {
        clubRepo.findById(id).get().setName(name);
    }

    public void deleteClub(int id) {
        clubRepo.deleteById(id);
    }

}
