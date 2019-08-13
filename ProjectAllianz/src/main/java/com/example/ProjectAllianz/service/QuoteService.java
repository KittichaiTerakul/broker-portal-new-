package com.example.ProjectAllianz.service;

import com.example.ProjectAllianz.model.Quote;
import com.example.ProjectAllianz.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService {

    @Autowired
    private QuoteRepository quoteRepository;


    public List<Quote> getAllCustomer(){
        return quoteRepository.findAll();
    }

    public Quote getCustomerById(int id){
        return quoteRepository.findById(id).orElse(null);
    }

    public Quote addCustomer(Quote quote){
        return quoteRepository.save(quote);
    }

    public void deleteCustomerById(int id){
        quoteRepository.deleteById(id);
    }

//    public Quote updateCustomerById(int id , Quote customer){
//        quoteRepository.findById(id).ifPresent(e -> customer.setId(e.getId()));
//        return  quoteRepository.save(customer);
//    }


}
