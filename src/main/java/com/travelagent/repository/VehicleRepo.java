package com.travelagent.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.travelagent.entity.service.Vehicle;

public interface VehicleRepo extends PagingAndSortingRepository<Vehicle, Integer> {

}
