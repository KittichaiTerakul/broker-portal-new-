package com.example.ProjectAllianz.controller;

import com.example.ProjectAllianz.dto.FundCustomerDto;
import com.example.ProjectAllianz.dto.QuoteDto;
import com.example.ProjectAllianz.entity.FundCustomer;
import com.example.ProjectAllianz.entity.Quote;
import com.example.ProjectAllianz.service.FundService;
import com.example.ProjectAllianz.service.QuoteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/quote")

public class QuoteController {

    @Autowired
    private QuoteService quoteService;
    @Autowired
    private FundService fundService;


    private ModelMapper modelMapper = new ModelMapper();



    /**
     * This method working about get information fund from databaseproject table is quote
     * @return
     */


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<QuoteDto> getAllCustomer(){



        List<Quote> quotes = quoteService.getAllCustomer();
        return quotes.stream().map(quote -> convertToDto(quote)).collect(Collectors.toList());
    }




    /**
     * frontend create client information and send to this method and save in database
     *
     */




    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public void createCustomer(@RequestBody QuoteDto quoteDto) throws ParseException {

//        if (quoteDto.getFirstName().equals("") || quoteDto.getLastName().equals("") || quoteDto.getGender().equals("") ||
//            quoteDto.getDateOfBirth().equals("") || quoteDto.getPreferredLanguages().equals("")){
//            System.out.println("Please input data");
//        }
        Quote quote = convertToEntity(quoteDto);
        Quote quoteCreate = quoteService.addCustomer(quote);
        convertToDto(quote);


//
//        else {
//
//        }
    }
    //
//





    @GetMapping(value = "/{id}")
    @ResponseBody
    public QuoteDto getCustomer(@PathVariable("id") int id){
        return convertToDto(quoteService.getCustomerById(id));


    }
//
//
    @PutMapping(value = "/{id}" )
    @ResponseStatus(HttpStatus.OK)
    public void updateCustomer(@RequestBody QuoteDto quoteDto) throws ParseException{
        Quote quote = convertToEntity(quoteDto);


    }


//    @GetMapping(value = "/fund")
//    @ResponseBody
//    public FundCustomerDto getCustomerById(@PathVariable("id") int id){
//        return convertToFundDto(fundService.getAllFundCustomer());
//
//
//    }


//    @RequestMapping(method = RequestMethod.GET)
//    @ResponseBody
//    public List<FundCustomerDto> getAllFund(){
//
//
//
//        List<FundCustomer> fundCustomers = fundService.getAllFundCustomer();
//        return fundCustomers.stream().map(fundCustomer -> convertToFundDto(fundCustomer)).collect(Collectors.toList());
//    }
//

//
//    /**
//     * getFundCustomer
//     */
//
//
//
//    /**
//     * convert to Dto and convert to entity
//     *
//     */
//
    private FundCustomerDto convertToFundDto(FundCustomer fundCustomer){
        FundCustomerDto fundCustomerDto = modelMapper.map(fundCustomer, FundCustomerDto.class);
        System.out.println(fundCustomerDto);
        return fundCustomerDto;

    }



    private QuoteDto convertToDto(Quote quote){
        QuoteDto quoteDto = modelMapper.map(quote, QuoteDto.class);

        return quoteDto;

    }




    private Quote convertToEntity(QuoteDto quoteDto) throws ParseException {
        Quote quote = modelMapper.map(quoteDto , Quote.class);


//        if (quoteDto.getId() !=  0){
            Quote oldQuote = quoteService.getCustomerById(quote.getId());

//        }
        return quote;
    }






}
