package com.codecool.flightclub.management.model;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import jakarta.persistence.Column;
import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plane {
    @Id
    private String id;
//    @Enumerated(EnumType.STRING)
    @ManyToOne
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
