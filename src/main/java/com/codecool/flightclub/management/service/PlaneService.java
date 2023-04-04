package com.codecool.flightclub.management.service;

import com.codecool.flightclub.management.model.Plane;
import com.codecool.flightclub.management.repository.PlaneRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Service
public class PlaneService {

    PlaneRepository planeRepository;

    public PlaneService(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }

    public void addPlane(Plane plane) {
        planeRepository.save(plane);
    }

    public List<Plane> getAllPlane(){
        return planeRepository.findAll();
    }
}
