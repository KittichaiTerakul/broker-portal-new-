package com.example.ProjectAllianz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fund")
public class FundInformation {

    @Id
    @Column(name = "fundId")
    private int fundId;

    @Column(name = "fundName")
    private String fundName;

    @Column(name = "fundDetails")
    private String fundDetails;

    @Column(name = "riskIndicator")
    private int riskIndicator;

    @Column(name = "rating")
    private int rating;


    public int getFundId() {
        return fundId;
    }

    public void setFundId(int fundId) {
        this.fundId = fundId;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundDetails() {
        return fundDetails;
    }

    public void setFundDetails(String fundDetails) {
        this.fundDetails = fundDetails;
    }

    public int getRiskIndicator() {
        return riskIndicator;
    }

    public void setRiskIndicator(int riskIndicator) {
        this.riskIndicator = riskIndicator;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
