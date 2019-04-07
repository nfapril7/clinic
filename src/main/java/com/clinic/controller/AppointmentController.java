package com.clinic.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.domain.Appointment;
import com.clinic.model.AppointmentModel;
import com.clinic.service.AppointmentService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/clinic/appointment")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/save")
    public Mono<Appointment> saveAppointment(@RequestBody AppointmentModel appointmentModel) {
        return appointmentService.save(appointmentModel);
    }

    @GetMapping("/findAll")
    public Flux<Appointment> findAll() {
        return appointmentService.findAll();
    }

}
