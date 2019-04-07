package com.clinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.domain.Schedule;
import com.clinic.service.ScheduleService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cllinic/schedule")
public class ScheduleController {

	@Autowired
	ScheduleService scheduleService;
	
	@PostMapping
	public Mono<Schedule> save(Schedule schedule) {
		return scheduleService.save(schedule);
	}
}
