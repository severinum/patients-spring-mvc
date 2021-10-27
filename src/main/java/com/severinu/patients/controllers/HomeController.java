package com.severinu.patients.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@ControllerAdvice
public class HomeController {

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @ModelAttribute
    public void setGlobalModelAttributes (Model model) {
        model.addAttribute("welcomeMessage",
                "Hi! This is global welcome message from Home Controller");
        model.addAttribute("manualPdf", "/patients/files/plik.pdf");
    }
}
