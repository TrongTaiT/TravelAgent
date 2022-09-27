package com.travelagent.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.travelagent.entity.service.Tour;

public interface TourRepo extends PagingAndSortingRepository<Tour, Integer> {

}
