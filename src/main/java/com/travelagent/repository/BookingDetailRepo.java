package com.travelagent.repository;

import org.springframework.data.repository.CrudRepository;

import com.travelagent.entity.BookingDetail;

public interface BookingDetailRepo extends CrudRepository<BookingDetail, Integer> {

}
