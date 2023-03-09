package com.codecool.flightclub.management.model;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.math.BigDecimal;
import java.util.Set;

public class Club {

    private int id;
    private BigDecimal price;
    private String name;
    private Set<User> users;
    private Set<Plane> planes;

    public Club(BigDecimal price, String name, Set<User> users, Set<Plane> planes, int id) {
        this.price = price;
        this.name = name;
        this.users = users;
        this.planes = planes;
        this.id = id;
    }

    public Club() {

    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public Set<Plane> getPlanes() {
        return planes;
    }

    public int getId() {
        return id;
    }
}
