package com.codecool.flightclub.management.model;

import java.util.UUID;

public class User {
    private String name;
    private int id = 0;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
