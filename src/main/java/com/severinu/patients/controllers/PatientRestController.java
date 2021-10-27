package com.severinu.patients.controllers;

import com.severinu.patients.model.Patient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientRestController {

    @GetMapping("/patient")
    public Patient getPatient (@RequestParam(value = "fname", defaultValue = "John") String firstName,
                               @RequestParam(value = "lname", defaultValue = "Doe") String lastName,
                               @RequestParam(value = "age", defaultValue = "34") Integer age
                               ) {

        Patient patient = new Patient();
        patient.setFname(firstName);
        patient.setLname(lastName);
        patient.setAge(age);

        return patient;
    }

    @PostMapping("/patient")
    public Patient addPatient (Patient patient) {

        System.out.println(patient.toString());

        return patient;
    }

}
