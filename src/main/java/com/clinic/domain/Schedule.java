package com.clinic.domain;

import java.util.Date;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(collection="SCHEDULE")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (callSuper = false)
public class Schedule{
	
	@Id
	@Field(value="id")
	public String scheduleId;
	
	public Date dateSchedule;	
	public String time;	
	public String nutritionistId;
	public String patientId;
	public String appointmentId;
	public int isActive;
	
}
