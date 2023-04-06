package com.codecool.flightclub.management.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Club {

    @Id
    private int id;
    private BigDecimal price;
    private String name;
    @OneToMany
    private Set<Client> users;
    @OneToMany
    private Set<Plane> planes;

}
