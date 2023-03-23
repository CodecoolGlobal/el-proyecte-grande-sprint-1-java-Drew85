package com.codecool.flightclub.management.model;

public class User {
    private String name;
    private int id;
    private Club club;

    public User(String name, int id, Club club) {
        this.name = name;
        this.id = id;
        this.club = club;
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

    public void setClub(Club club) {
        this.club = club;
    }

    public Club getClub() {
        return club;
    }

    public void setId(int id) {
        this.id = id;
    }
}
