package com.example.ProjectAllianz.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fundCustomer")
public class FundCustomer {

    @Id

    @Column(name = "quoteQuoteId")
    private int quoteQuoteId;

    @Column(name = "fundId")
    private int fundId;


    @Column(name = "percent")
    private int percent;


    public int getQuoteQuoteId() {
        return quoteQuoteId;
    }

    public void setQuoteQuoteId(int quoteQuoteId) {
        this.quoteQuoteId = quoteQuoteId;
    }

    public int getFundId() {
        return fundId;
    }

    public void setFundId(int fundId) {
        this.fundId = fundId;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
