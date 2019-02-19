package com.clinic.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.clinic.domain.Appointment;

public interface AppointmentRepository extends MongoRepository<Appointment, String>{

}
