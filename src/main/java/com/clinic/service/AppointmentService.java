package com.clinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clinic.domain.Appointment;
import com.clinic.exception.CustomException;
import com.clinic.model.AppointmentModel;
import com.clinic.repository.AppointmentRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    public Mono<Appointment> save(AppointmentModel appointmentModel) {
        Appointment appointment = new Appointment();
        appointment.setApprovedBy(appointmentModel.getApprovedBy());
        appointment.setApprove(0);
        appointment.setDateAppointment(appointmentModel.getDateAppointment());
        appointment.setDescription(appointmentModel.getDescription());
        appointment.setIdNutritionist(appointmentModel.getIdNutritionist());
        appointment.setIdUser(appointmentModel.getIdUser());
        return appointmentRepository.save(appointment);
    }

    public Flux<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

}
