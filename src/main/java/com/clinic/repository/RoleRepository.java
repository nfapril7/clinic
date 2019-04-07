package com.clinic.repository;

import com.clinic.domain.Role;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RoleRepository extends ReactiveMongoRepository<Role, String>{

}
