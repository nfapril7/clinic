package com.clinic.domain;

import java.util.Date;

import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.hateoas.ResourceSupport;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Document(collection = "APPOINTMENT")
@Data
@EqualsAndHashCode (callSuper = false)
public class Appointment extends ResourceSupport{

	@Field(value="id")
	@Id
	public String idAppointment;
	public Date dateAppointment;
	public String description;
	public String idUser;
	public String idNutritionist;
	public String approvedBy;
	public int approve;

}
