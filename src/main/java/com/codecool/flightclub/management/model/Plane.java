package com.codecool.flightclub.management.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Plane {
    private String id;
    private PlaneType planeType;
    private BigDecimal flightCost;
    private LocalDate onAir;


    public Plane(String id, PlaneType planeType, BigDecimal flightCost, LocalDate onAir) {
        this.id = id;
        this.planeType = planeType;
        this.flightCost = flightCost;
        this.onAir = onAir;
    }

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
