package com.clinic.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "APPOINTMENT")
@Data
public class Appointment {
	
	@Id
	public String id;
	
	public Date dateAppointment;
	public String description;
	public String idUser;
	public String idNutritionist;
	public String approvedBy;
	public int apprrove;	

}
