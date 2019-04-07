package com.clinic.repository;

import com.clinic.domain.Schedule;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ScheduleRepository extends ReactiveMongoRepository<Schedule, String>{

}
