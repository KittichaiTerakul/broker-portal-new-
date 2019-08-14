package com.example.ProjectAllianz.entity;


import javax.persistence.*;

@Entity
@Table(name="fundCustomer")
public class FundCustomer {

    @Id
    @Column(name = "fundcustomerId")
    private int fundcustomerId;

//    @ManyToOne
//    @JoinColumn(name = "quoteId")
//    private Quote quote;

    @Column(name = "fundId")
    private int fundId;


    @Column(name = "percentage")
    private int percentage;




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
