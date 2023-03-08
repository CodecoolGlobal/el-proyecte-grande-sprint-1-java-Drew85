package com.codecool.flightclub.management;

import com.codecool.flightclub.management.model.Plane;
import com.codecool.flightclub.management.model.PlaneType;
import com.codecool.flightclub.management.service.PlaneCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;

@Configuration
public class AppConfig {
    @Bean
    public PlaneCreator createPlane(){
        return new PlaneCreator();
    }
}
