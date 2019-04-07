package com.clinic.repository;


import com.clinic.domain.Appointment;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AppointmentRepository extends ReactiveMongoRepository<Appointment, String>{

}
