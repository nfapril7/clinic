package com.clinic.model;

import java.util.Date;

import org.springframework.hateoas.ResourceSupport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppointmentModel extends ResourceSupport {

	public Date dateAppointment;
	public String description;
	public String idUser;
	public String idNutritionist;
	public String approvedBy;
	public int apprrove;	
}
