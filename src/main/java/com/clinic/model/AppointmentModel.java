package com.clinic.model;

import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppointmentModel {

    @NotNull
    public Date dateAppointment;
    public String description;
    @NotNull
    public String idUser;

    @NotNull
    public String idNutritionist;
    public String approvedBy;
    public int apprrove;
}
