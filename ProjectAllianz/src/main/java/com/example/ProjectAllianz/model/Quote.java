package com.example.ProjectAllianz.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="quote")
public class Quote {
    @Id

    @Column(name= "quoteId")
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @SequenceGenerator(name="id", initialValue=5, allocationSize=100)
//    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="quoteId")
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;

    @Column(name = "gender")
    private String gender;
    @Column(name = "dateOfBirth")
    private String dateOfBirth;
    @Column(name = "PreferredLanguage")
    private String preferredLanguages;



    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
