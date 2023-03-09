package com.codecool.flightclub.management.controller;
import com.codecool.flightclub.management.model.Plane;
import com.codecool.flightclub.management.service.PlaneCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/planes")
public class PlaneController {
    private PlaneCreator planeCreator;

    @Autowired
    public PlaneController(PlaneCreator planeCreator) {
        this.planeCreator = planeCreator;
    }

    @GetMapping
    public List<Plane> getPlaneList() {
        return planeCreator.addToPlaneList();
    }
}
