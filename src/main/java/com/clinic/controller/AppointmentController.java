package com.clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.domain.Appointment;
import com.clinic.exception.CustomException;
import com.clinic.model.AppointmentModel;
import com.clinic.service.AppointmentService;
import com.clinic.support.Constant;
import com.clinic.support.MessageOutput;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

@RestController
@RequestMapping("/clinic/appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping("/save")
	public HttpEntity<MessageOutput> saveAppointment(@RequestBody AppointmentModel appointmentModel) {
		MessageOutput mo = new MessageOutput();
		try {
			Appointment appointment = appointmentService.save(appointmentModel);
			if(appointment==null) {
				throw new CustomException("Saving data failed");
			}			
			mo.setData(appointment);
			mo.setMessage("Save data successfully");
			mo.setStatus(Constant.SUCCESS);			
		}catch(Exception ex) {
			//LOG+ex
			mo.setData("Data not found");
			mo.setMessage("Save data failed");
			mo.setStatus(Constant.ERROR);	
		}
		return new ResponseEntity<>(mo, HttpStatus.OK);	
	}
	
	@GetMapping("/findAll")
	public HttpEntity<MessageOutput> findAll() {
		MessageOutput mo = new MessageOutput();
			List<Appointment> appointments = appointmentService.findAll();
			if(appointments.isEmpty()) {
				mo.setData("Data not exist");
				mo.setStatus(Constant.ERROR);
				mo.setMessage("Find data failed");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			appointments.forEach(d->d.add(linkTo(methodOn(AppointmentController.class).findAll()).withRel("appointment")));
			mo.setData(appointments);
			mo.setStatus(Constant.SUCCESS);
			mo.setMessage("Find data succesfully");
			return new ResponseEntity<>(mo, HttpStatus.OK);		
	}	
	

}
