package com.example.ProjectAllianz.entity;

import javax.persistence.*;
import java.util.Date;

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

    @Column(name = "quoteId")
    private String quoteId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @Column(name = "preferredLanguages")
    private String preferredLanguages;

    @OneToMany
    private FundCustomer fundCustomer;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public String getPreferredLanguages() {
        return preferredLanguages;
    }

    public void setPreferredLanguages(String preferredLanguages) {
        this.preferredLanguages = preferredLanguages;
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
