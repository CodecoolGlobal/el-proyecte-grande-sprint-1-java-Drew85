package com.codecool.flightclub.management.model;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.math.BigDecimal;
import java.util.Set;

public class Club {
    private BigDecimal price;
    private String name;
    private Set<User> users;
    private Set<Plane> planes;

    public Club(BigDecimal price, String name, Set<User> users, Set<Plane> planes) {
        this.price = price;
        this.name = name;
        this.users = users;
        this.planes = planes;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Set<User> getUsers() {
        return users;
    }

    public Set<Plane> getPlanes() {
        return planes;
    }
}
