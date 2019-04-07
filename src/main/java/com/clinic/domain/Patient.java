package com.clinic.domain;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(collection="PATIENT")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (callSuper = false)
public class Patient {

	@Id
	@Field(value="id")
	public String docId;
	
	public String accountId;
	
	public String branch;
	
	public int age;
	
	public double weight; 
	
	public int height;
	
	public String disease [];
	
	public String banned [];

}
