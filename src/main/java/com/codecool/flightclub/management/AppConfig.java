package com.codecool.flightclub.management;

import com.codecool.flightclub.management.model.Club;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Club createClub(){
        return new Club();
    }
}
