package com.codecool.flightclub.management.model;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
public class Plane {
    @Id
    private String id;
    @Enumerated(EnumType.STRING)
    private PlaneType planeType;
    private Integer flightCost;
    private LocalDateTime onAir;


    public Plane(String id, PlaneType planeType, Integer flightCost, LocalDateTime onAir) {
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

    public Integer getFlightCost() {
        return flightCost;
    }

    public void setFlightCost(Integer flightCost) {
        this.flightCost = flightCost;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getOnAir() {
        return onAir;
    }

    public void setOnAir(LocalDateTime onAir) {
        this.onAir = onAir;
    }
}
