package com.codecool.flightclub.management.service;

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

    public List<User> getUsers() {
        return users;
    }

    public User getUser(int id) {
        for (User user : users) {
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public void AddNewUser(String name) {
        users.add(new User(name, users.size() == 0 ? 0 : users.get(users.size() - 1).getId() + 1));
    }

    public void editUser(int id, String newName) {
        getUser(id).setName(newName);
    }

    public void deleteUser(int id) {
        users.remove(getUser(id));
    }
}
