package com.clinic.domain;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(collection = "ROLE")
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (callSuper = false)
public class Role {
	
	@Id
	@Field(value="id")
	public String docId;
	
	public int idRole;	
	public int nameRole;

}
