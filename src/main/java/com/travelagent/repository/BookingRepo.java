package com.travelagent.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.travelagent.entity.Booking;

public interface BookingRepo extends PagingAndSortingRepository<Booking, Integer> {

}
