package com.clinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.domain.Appointment;
import com.clinic.exception.CustomException;
import com.clinic.model.AppointmentModel;
import com.clinic.repository.AppointmentRepository;
import com.clinic.support.Constant;
import com.clinic.support.MessageOutput;

@Service
public class AppointmentService {
	
	@Autowired
	AppointmentRepository appointmentRepository;
	
	public MessageOutput save(AppointmentModel appointmentModel) {
		MessageOutput mo = new MessageOutput();
		try {
			Appointment appointment = new Appointment();
			appointment.setApprovedBy(appointmentModel.getApprovedBy());
			appointment.setApprrove(0);
			appointment.setDateAppointment(appointmentModel.getDateAppointment());
			appointment.setDescription(appointmentModel.getDescription());
			appointment.setIdNutritionist(appointmentModel.getIdNutritionist());
			appointment.setIdUser(appointmentModel.getIdUser());
			if(appointment==null) {
				throw new CustomException("Data can't be null");
			}
			appointmentRepository.save(appointment);
			mo.setData(appointment);
			mo.setMessage("Save data successfully");
			mo.setStatus(Constant.SUCCESS);			
		}catch(Exception ex) {
			//LOG+ex
			mo.setData("Data not found");
			mo.setMessage("Save data failed");
			mo.setStatus(Constant.ERROR);	
		}
		return mo;		
	}
	
	public MessageOutput findAll(){
		MessageOutput mo = new MessageOutput();
		try {
			List<Appointment> appointments = appointmentRepository.findAll();
			if(appointments.isEmpty()) {
				throw new CustomException("Data not found");
			}
			mo.setData(appointments);
			mo.setStatus(Constant.SUCCESS);
			mo.setMessage("Find data succesfully");
		}catch(Exception ex) {
			//LOG
			mo.setData("Data not exist");
			mo.setStatus(Constant.ERROR);
			mo.setMessage("Find data failed");
		}
		return mo;
	}
	
}
