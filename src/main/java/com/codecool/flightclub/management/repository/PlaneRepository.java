package com.codecool.flightclub.management.repository;

import com.codecool.flightclub.management.model.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaneRepository extends JpaRepository<Plane, String> {
}
