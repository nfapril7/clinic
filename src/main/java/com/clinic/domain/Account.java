package com.clinic.domain;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.hateoas.ResourceSupport;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Document(collection = "ACCOUNT")
@Data
@EqualsAndHashCode (callSuper = false)
public class Account extends ResourceSupport{

	@Field(value="id")
	public String docId;
	
	public String accountId;
	public String name;
	public int role[];
	public String address[];
	public Date birth;
	public int isActive;
	
	
}
