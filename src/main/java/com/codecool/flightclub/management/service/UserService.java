package com.codecool.flightclub.management.service;

import com.codecool.flightclub.management.model.Club;
import com.codecool.flightclub.management.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private List<User> users;

    @Autowired
    public UserService(List<User> users) {
        this.users = users;
    }

    @Autowired
    public List<User> getUsers() {
        return users;
    }

    @Autowired
    public User getUser(int id) {
        for (User user : users) {
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }
    
    @Autowired
    public void AddNewUser(String name) {
        users.add(new User(name, users.size() == 0 ? 0 : users.get(users.size() - 1).getId() + 1));
    }

    @Autowired
    public void editUser(int id, String newName) {
        getUser(id).setName(newName);
    }

    @Autowired
    public void deleteUser(int id) {
        users.remove(getUser(id));
    }
    
    @Autowired
    public void addClubToUser(Club club, User user){
        user.setClub(club);
    }
    
}
