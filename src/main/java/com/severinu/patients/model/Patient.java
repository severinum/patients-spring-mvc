package com.severinu.patients.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Patient {
    @NotNull(message = "First name is required")
    @Length(min = 2, max = 30, message = "Length must be between 2 and 30")
    private String fname;
    @NotNull(message = "Last name is required")
    @Length(min = 2, max = 30, message = "Length must be between 2 and 30")
    private String lname;
    @NotNull(message = "Age is required")
    @Min(value = 1, message = "Min age 1")
    @Max(value = 120, message = "Max age 120")
    private Integer age;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
