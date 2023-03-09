package com.codecool.flightclub.management.service;

import com.codecool.flightclub.management.model.Plane;
import com.codecool.flightclub.management.model.PlaneType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class PlaneCreator {

    private List<Plane> planeList = new ArrayList<>();

    public List<Plane> addToPlaneList() {
        planeList.add(new Plane("SAA211", PlaneType.FALKE, BigDecimal.ONE, LocalDate.now()));
        planeList.add(new Plane("DAW211", PlaneType.CESSNA152, BigDecimal.TEN, LocalDate.now()));
        return planeList;
    }

    public PlaneCreator() {
    }

}
