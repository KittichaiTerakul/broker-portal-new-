package com.example.ProjectAllianz.dto;

public class FundInformationDto {

    private int fundId;
    private String fundName;
    private String fundDetails;
    private int riskIndicator;
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


