package com.codecool.flightclub.management.service;

import com.codecool.flightclub.management.model.Club;
import com.codecool.flightclub.management.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users;

    public UserService(List<User> users) {
        this.users = new ArrayList<>();
    }

    @Autowired
    public void AddNewMember() {
       users.add(new User("Béla", 4, null));
    }

    public User getUsers(int id) {
        for (User user : users) {
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public void addClubToUser(Club club, User user){
        user.setClub(club);
    }

    public List<User> getUsers() {
        return users;
    }
}
