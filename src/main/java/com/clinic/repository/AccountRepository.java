package com.clinic.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.clinic.domain.Account;

public interface AccountRepository extends MongoRepository<Account, String>{

}
