package com.travelagent.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.travelagent.entity.service.Hotel;

public interface HotelRepo extends PagingAndSortingRepository<Hotel, Integer> {

}
