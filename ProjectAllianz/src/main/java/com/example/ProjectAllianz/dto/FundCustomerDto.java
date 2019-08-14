package com.example.ProjectAllianz.dto;

import com.example.ProjectAllianz.entity.Quote;

public class FundCustomerDto {

    private int fundcustomerId;
    private QuoteDto quoteDto;
    private int fundId;
    private int percentage;


    public int getFundcustomerId() {
        return fundcustomerId;
    }

    public void setFundcustomerId(int fundcustomerId) {
        this.fundcustomerId = fundcustomerId;
    }

    public QuoteDto getQuoteDto() {
        return quoteDto;
    }

    public void setQuoteDto(QuoteDto quoteDto) {
        this.quoteDto = quoteDto;
    }

    public int getFundId() {
        return fundId;
    }

    public void setFundId(int fundId) {
        this.fundId = fundId;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
