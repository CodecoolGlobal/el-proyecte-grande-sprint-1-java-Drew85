package com.codecool.flightclub.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Plane {
    @Id
    private String id;
    private PlaneType planeType;
    private BigDecimal flightCost;
    private LocalDate onAir;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public BigDecimal getFlightCost() {
        return flightCost;
    }

    public void setFlightCost(BigDecimal flightCost) {
        this.flightCost = flightCost;
    }

    public LocalDate getOnAir() {
        return onAir;
    }

    public void setOnAir(LocalDate onAir) {
        this.onAir = onAir;
    }
}
