package com.clinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.domain.Account;
import com.clinic.domain.Patient;
import com.clinic.model.AccountInfoModel;
import com.clinic.repository.AccountRepository;
import com.clinic.repository.PatientRepository;
import reactor.core.publisher.Mono;

@Service
public class AccountInfoService {

	@Autowired
	AccountRepository accountRepository;
	@Autowired
	PatientRepository patientRepository;
	
//	public AccountInfoModel save(AccountInfoModel accountModel) {
//		saveAccount(accountModel);
//		savePatient(accountModel);		
//		return accountModel;
//	}
//	
	public Mono<Account> saveAccount(AccountInfoModel accountModel) {
		Account account = new Account();
		account.setAccountId(accountModel.getAccountId());
		account.setAddress(accountModel.getAddress());
		account.setBirth(accountModel.getBirth());
		account.setName(accountModel.getName());
		account.setRole(accountModel.getRole());
		return accountRepository.save(account);		 
	}
	
	public Mono<Patient> savePatient(AccountInfoModel accountModel) {
		Patient patient = new Patient();
		patient.setAccountId(accountModel.getAccountId());
		patient.setAge(accountModel.getAge());
		patient.setBanned(accountModel.getBanned());
		patient.setBranch(accountModel.getBranch());
		patient.setDisease(accountModel.getDisease());
		patient.setHeight(accountModel.getHeight());
		patient.setWeight(accountModel.getWeight());
		return patientRepository.save(patient);
	}
}
