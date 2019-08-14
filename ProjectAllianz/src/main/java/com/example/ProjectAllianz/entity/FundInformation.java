package com.example.ProjectAllianz.entity;

import io.swagger.models.auth.In;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fundinformation")
public class FundInformation {

    @Id


    @Column(name = "fundName")
    private String fundName;


    @Column(name = "riskIndicator")
    private int riskIndicator;

    @Column(name = "rating")
    private Integer rating;



    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }



    public int getRiskIndicator() {
        return riskIndicator;
    }

    public void setRiskIndicator(int riskIndicator) {
        this.riskIndicator = riskIndicator;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
