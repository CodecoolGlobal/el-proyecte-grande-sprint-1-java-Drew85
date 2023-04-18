package com.codecool.flightclub.management.controller;
import com.codecool.flightclub.management.model.Plane;
import com.codecool.flightclub.management.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planes")
public class PlaneController {
    private PlaneService planeService;


    @Autowired
    public PlaneController(PlaneService planeService) {
        this.planeService = planeService;
    }

    @PostMapping
    public void addPlane(@RequestBody Plane plane) {
        planeService.addPlane(plane);
    }

    @GetMapping
    public List<Plane> getAllPlane(){
        return planeService.getAllPlane();
    }
}
