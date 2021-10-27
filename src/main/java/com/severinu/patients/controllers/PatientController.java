package com.severinu.patients.controllers;

import com.severinu.patients.model.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
@ControllerAdvice
public class PatientController {

    @GetMapping("register")
    public String register (@ModelAttribute ("patient") Patient patient) {

//        patient.setFname("John");
//        patient.setLname("Doe");
//        patient.setAge(35);

        return "register";
    }

    @PostMapping("register")
    public String addRegistration (@Valid @ModelAttribute ("patient") Patient patient,
                                   BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            System.out.println("Form validation problem");
            return "register";
        }

        System.out.println("Patient: " + patient.getFname() + " ," +
                patient.getLname() + ", " +
                patient.getAge());
        return "redirect:register";
    }
}
