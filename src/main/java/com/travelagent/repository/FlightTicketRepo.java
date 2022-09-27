package com.travelagent.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.travelagent.entity.service.FlightTicket;

public interface FlightTicketRepo extends PagingAndSortingRepository<FlightTicket, Integer> {

}
