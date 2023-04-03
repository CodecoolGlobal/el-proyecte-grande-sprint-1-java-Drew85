package com.codecool.flightclub.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.math.BigDecimal;
import java.util.Set;

@Entity
public class Club {

    @Id
    private int id;
    private BigDecimal price;
    private String name;
    @OneToMany
    private Set<Client> clients;
    @OneToMany
    private Set<Plane> planes;

    public Club(BigDecimal price, String name, Set<Client> clients, Set<Plane> planes, int id) {
        this.price = price;
        this.name = name;
        this.clients = clients;
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

    public Set<Client> getUsers() {
        return clients;
    }

    public Set<Plane> getPlanes() {
        return planes;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
