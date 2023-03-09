package com.codecool.flightclub.management;

import com.codecool.flightclub.management.model.Club;
import com.codecool.flightclub.management.service.PlaneCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PlaneCreator createPlane(){
        return new PlaneCreator();
    }
    @Bean
    public Club createClub(){
        return new Club();
    }
}
