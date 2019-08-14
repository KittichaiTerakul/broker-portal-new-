package com.example.ProjectAllianz.dto;

import com.example.ProjectAllianz.customvalidatot.DateConstraint;

import javax.validation.constraints.NotEmpty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class QuoteDto {

    private int id;
//    @NotEmpty(message = "first name must not be empty")
    private String firstName;
//    @NotEmpty(message = "first name must not be empty")
    private String lastName;
//    @NotEmpty(message = "first name must not be empty")
    private String gender;
    @NotEmpty(message = "date must not be empty")
    @DateConstraint
    private String dateOfBirth;
//    private String dateOfBirth;
//    @NotEmpty(message = "first name must not be empty")
    private String preferredLanguages;



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {

        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {

        this.dateOfBirth = dateOfBirth;
    }

    public String getPreferredLanguages() {
        return preferredLanguages;
    }

    public void setPreferredLanguages(String preferredLanguages) {
        this.preferredLanguages = preferredLanguages;
    }



}
