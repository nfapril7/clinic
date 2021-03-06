package com.clinic.domain;

import java.util.Date;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(collection = "APPOINTMENT")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (callSuper = false)
public class Appointment {

	@Field(value="id")
	@Id
	public String idAppointment;
        @NotNull
	public Date dateAppointment;
	public String description;
        @NotNull
	public String idUser;
        @NotNull
	public String idNutritionist;
	public String approvedBy;
	public int approve;

}
