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
	
	public Appointment save(AppointmentModel appointmentModel) {
		Appointment appointment = null;
		try {
			appointment = new Appointment();
			appointment.setApprovedBy(appointmentModel.getApprovedBy());
			appointment.setApprove(0);
			appointment.setDateAppointment(appointmentModel.getDateAppointment());
			appointment.setDescription(appointmentModel.getDescription());
			appointment.setIdNutritionist(appointmentModel.getIdNutritionist());
			appointment.setIdUser(appointmentModel.getIdUser());
			if(appointment==null) {
				throw new CustomException("Data can't be null");
			}
			appointmentRepository.save(appointment);		
		}catch(Exception ex) {
			//LOG+ex	
		}
		return appointment;		
	}
	
	public List<Appointment> findAll(){
//		MessageOutput mo = new MessageOutput();
//		try {
			List<Appointment> appointments = appointmentRepository.findAll();
//			if(appointments.isEmpty()) {
//				throw new CustomException("Data not found");
//			}
//			mo.setData(appointments);
//			mo.setStatus(Constant.SUCCESS);
//			mo.setMessage("Find data succesfully");
//		}catch(Exception ex) {
//			//LOG
//			mo.setData("Data not exist");
//			mo.setStatus(Constant.ERROR);
//			mo.setMessage("Find data failed");
//		}
		return appointments;
	}
	
}
