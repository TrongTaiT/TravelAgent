package com.travelagent.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking_details")
public class BookingDetail implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "booking_start_date")
	private Date bookingStartDate;

	@Column(name = "booking_end_date")
	private Date bookingEndDate;

	@Column(length = 500)
	private String notes;

	@ManyToOne
	@JoinColumn(name = "booking_id")
	private Booking booking;

	@Enumerated(EnumType.STRING)
	private ServiceType serviceType;

	@Column(name = "service_detail_id")
	private Integer serviceDetailId;

}
