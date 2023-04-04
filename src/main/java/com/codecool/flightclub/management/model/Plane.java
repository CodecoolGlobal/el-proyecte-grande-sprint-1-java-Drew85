package com.codecool.flightclub.management.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
public class Plane {
    @Id
    private String id;
    private PlaneType planeType;
    private BigDecimal flightCost;
    private LocalDateTime onAir;


    public Plane(String id, PlaneType planeType, BigDecimal flightCost, LocalDateTime onAir) {
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

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getOnAir() {
        return onAir;
    }

    public void setOnAir(LocalDateTime onAir) {
        this.onAir = onAir;
    }
}
