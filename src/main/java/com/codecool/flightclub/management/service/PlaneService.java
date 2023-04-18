package com.codecool.flightclub.management.service;

import com.codecool.flightclub.management.model.Plane;
import com.codecool.flightclub.management.model.PlaneType;
import com.codecool.flightclub.management.repository.PlaneRepository;
import com.codecool.flightclub.management.repository.PlaneTypeRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class PlaneService {

    PlaneRepository planeRepository;
    PlaneTypeRepository planeTypeRepository;

    public PlaneService(PlaneRepository planeRepository, PlaneTypeRepository planeTypeRepository) {
        this.planeRepository = planeRepository;
        this.planeTypeRepository = planeTypeRepository;
    }

    public void addPlane(Plane plane) {
        PlaneType planeType = plane.getPlaneType();
        if (planeTypeRepository.findById(planeType.getId()).isEmpty()
        ) {
            planeTypeRepository.save(planeType);
        }
        planeRepository.save(plane);
    }

    public List<Plane> getAllPlane() {
        return planeRepository.findAll();
    }
}
