package com.codecool.flightclub.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Data
public class Club {

    @Id
    private Long id;
    private BigDecimal price;
    private String name;
    @OneToMany
    private Set<Client> users;
    @OneToMany
    private Set<Plane> planes;

    public Club(BigDecimal price, String name, Set<Client> users, Set<Plane> planes, Long id) {
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

    public Set<Client> getUsers() {
        return users;
    }

    public Set<Plane> getPlanes() {
        return planes;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
