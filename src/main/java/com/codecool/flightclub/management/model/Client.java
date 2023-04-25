package com.codecool.flightclub.management.model;

import jakarta.persistence.*;
import lombok.*;


import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client {
    @Column(unique = true)
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Club club;

    private String email;
    private String password;
    @ManyToMany
    private Set<RoleEntity> roles;

}
