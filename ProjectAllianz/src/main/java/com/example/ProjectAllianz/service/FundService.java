package com.example.ProjectAllianz.service;

import com.example.ProjectAllianz.model.FundCustomer;
import com.example.ProjectAllianz.repository.FundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundService {

    @Autowired
    private FundRepository fundRepository;

    public List<FundCustomer> getAllFunds(){
        return fundRepository.findAll();
    }

    public void addFunds(FundCustomer fundCustomer){
        fundRepository.save(fundCustomer);
    }

//    public List<FundCustomer> getFundByCustomerId(int customerId){
//        return fundRepository.findFundsByCustomerId(customerId);
//    }

}
