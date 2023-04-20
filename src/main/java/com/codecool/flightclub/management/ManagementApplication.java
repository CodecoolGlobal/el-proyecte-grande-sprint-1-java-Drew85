package com.codecool.flightclub.management;

import com.codecool.flightclub.management.service.InitService;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManagementApplication {

	@Autowired
	InitService initService;

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}

	@PostConstruct
	public void initServiceDatabase(){

		initService.initServiceDatabase();
	}
}
