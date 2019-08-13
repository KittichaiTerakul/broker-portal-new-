package com.example.ProjectAllianz.controller;


import com.example.ProjectAllianz.dto.FundInformationDto;
import com.example.ProjectAllianz.model.FundInformation;
import com.example.ProjectAllianz.service.FundInformationService;
import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/information")
public class FundInformationController {
    @Autowired
    private FundInformationService fundInformationService;

    private ModelMapper modelMapper = new ModelMapper();



    /**
     * This method working about get information fund from databaseproject table is fund
     *
     */


    @ApiOperation(value = "Information ", notes = "Information  test")

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<FundInformationDto> getAllFundInformation(){
        List<FundInformation> fundInformations = fundInformationService.getAllFundInformation();
        return fundInformations.stream().map(fundInformation -> convertToDto(fundInformation)).collect(Collectors.toList());
    }




    /**
     * get data from database and convert to dto for show on screen
     * @param fundInformation
     * @return
     */


    private FundInformationDto convertToDto(FundInformation fundInformation){
        FundInformationDto fundInformationDto = modelMapper.map(fundInformation,FundInformationDto.class);
        return fundInformationDto;
    }
}
