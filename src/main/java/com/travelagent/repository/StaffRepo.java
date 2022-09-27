package com.travelagent.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.travelagent.entity.Staff;

public interface StaffRepo extends PagingAndSortingRepository<Staff, Integer> {

}
