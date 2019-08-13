package com.example.ProjectAllianz.service;

import com.example.ProjectAllianz.model.FundInformation;
import com.example.ProjectAllianz.repository.FundInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundInformationService {
    @Autowired
    private FundInformationRepository fundInformationRepository;

    public List<FundInformation> getAllFundInformation(){
        return fundInformationRepository.findAll();
    }

}
