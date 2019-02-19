package com.clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.domain.Appointment;
import com.clinic.model.AppointmentModel;
import com.clinic.service.AppointmentService;
import com.clinic.support.MessageOutput;

@RestController
@RequestMapping("/clinic/appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	@PostMapping("/save")
	public MessageOutput saveAppointment(@RequestBody AppointmentModel appointmentModel) {
		 return appointmentService.save(appointmentModel);
	}
	
	@GetMapping("/findAll")
	public MessageOutput findAll() {
		return appointmentService.findAll();
	}	
	

}
