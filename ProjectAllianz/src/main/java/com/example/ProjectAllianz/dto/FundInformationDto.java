package com.example.ProjectAllianz.dto;

import io.swagger.models.auth.In;

public class FundInformationDto {

    private String fundName;

    private int riskIndicator;
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


