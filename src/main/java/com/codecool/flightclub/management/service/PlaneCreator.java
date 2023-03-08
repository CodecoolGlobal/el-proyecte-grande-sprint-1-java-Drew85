package com.codecool.flightclub.management.service;

import com.codecool.flightclub.management.model.Plane;
import com.codecool.flightclub.management.model.PlaneType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;


public class PlaneCreator {


    public PlaneCreator() {
    }

    public Plane planeCreator(){
        return new Plane("sda", PlaneType.CESSNA152, BigDecimal.ONE, LocalDate.now());
    }

}
