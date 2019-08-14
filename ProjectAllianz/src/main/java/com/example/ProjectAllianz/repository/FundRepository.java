package com.example.ProjectAllianz.repository;

import com.example.ProjectAllianz.entity.FundCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundRepository extends JpaRepository<FundCustomer,Integer> {
}
