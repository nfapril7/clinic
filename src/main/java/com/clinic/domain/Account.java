package com.clinic.domain;

import java.util.Date;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(collection = "ACCOUNT")
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Account {

    @Id
    @Field(value = "id")
    public String docId;

    public String accountId;
    public String name;
    public int role[];
    public String address[];
    public Date birth;
    @Builder.Default()
    private int isActive = 1;

}
