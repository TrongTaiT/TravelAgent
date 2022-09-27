package com.travelagent.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.travelagent.entity.Customer;

public interface CustomerRepo extends PagingAndSortingRepository<Customer, Integer> {

}
