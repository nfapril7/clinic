package com.clinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.domain.Schedule;
import com.clinic.repository.ScheduleRepository;
import reactor.core.publisher.Mono;

@Service
public class ScheduleService {

	@Autowired
	ScheduleRepository scheduleRepository;
	
	public Mono<Schedule> save(Schedule schedule) {
		Schedule saveSchedule = new Schedule();
		saveSchedule.setDateSchedule(schedule.getDateSchedule());
		saveSchedule.setNutritionistId(schedule.getNutritionistId());
		saveSchedule.setAppointmentId(schedule.getAppointmentId());
		saveSchedule.setPatientId(schedule.getPatientId());
		saveSchedule.setTime(schedule.getTime());
		return scheduleRepository.save(saveSchedule);
	}
}
