package com.travelagent.entity.service;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@Entity
@Table(name = "flight_tickets")
public class FlightTicket extends Service {

}
