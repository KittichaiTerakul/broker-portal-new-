package com.example.ProjectAllianz.service;

import com.example.ProjectAllianz.entity.FundCustomer;
import com.example.ProjectAllianz.repository.FundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundService {

    @Autowired
    private FundRepository fundRepository;

    public List<FundCustomer> getAllFundCustomer(){
        return fundRepository.findAll();

    }


    public FundCustomer getCustomerById(int id){
        return fundRepository.findById(id).orElse(null);
    }



}
