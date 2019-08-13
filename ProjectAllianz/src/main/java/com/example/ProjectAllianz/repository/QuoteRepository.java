package com.example.ProjectAllianz.repository;

import com.example.ProjectAllianz.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuoteRepository extends JpaRepository<Quote,Integer> {

}
