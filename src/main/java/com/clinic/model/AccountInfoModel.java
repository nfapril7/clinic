package com.clinic.model;

import java.util.Date;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountInfoModel {

    public String accountId;
    public String name;
    public int role[];
    public String address[];
    public Date birth;
    public int isActive;
    public String branch;
    public int age;
    public double weight;
    public int height;
    public String disease[];
    public String banned[];
}
