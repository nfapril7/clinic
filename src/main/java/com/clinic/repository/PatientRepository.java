package com.clinic.repository;


import com.clinic.domain.Patient;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PatientRepository extends ReactiveMongoRepository<Patient, String>{

}
