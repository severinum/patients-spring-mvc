package com.severinu.patients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PatientsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PatientsApplication.class, args);
    }

}
