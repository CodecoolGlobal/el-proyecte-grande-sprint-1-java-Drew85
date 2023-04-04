package com.codecool.flightclub.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Club {

    @Id
    private Integer id;
    private BigDecimal price;
    private String name;
    @OneToMany
    private Set<Client> clients;
    @OneToMany
    private Set<Plane> planes;

    public Club(BigDecimal price, String name, Set<Client> clients, Set<Plane> planes, Integer id) {
        this.price = price;
        this.name = name;
        this.clients = clients;
        this.planes = planes;
        this.id = id;
    }
    
}
