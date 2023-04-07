package com.codecool.flightclub.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlaneType {
    @Id
    private Long id;
    private String name;
    private String registrationNumber;



//    FALKE,
//    CESSNA152,
//    CESSNA172,
//    GLIDER;

}
