package com.example.ProjectAllianz.repository;

import com.example.ProjectAllianz.model.FundCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundRepository extends JpaRepository<FundCustomer,Integer> {
}
