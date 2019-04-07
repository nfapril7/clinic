package com.clinic.controller;


import com.clinic.domain.Account;
import com.clinic.domain.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.exception.CustomException;
import com.clinic.model.AccountInfoModel;
import com.clinic.service.AccountInfoService;
import com.clinic.support.Constant;
import com.clinic.support.MessageOutput;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/clinic/account")
public class AccountController {

	@Autowired
	AccountInfoService accountService;
	
	@PostMapping("/save")
	public Mono<Account> saveAccout(@RequestBody AccountInfoModel accountModel) {
		return accountService.saveAccount(accountModel);
	}
        
        @PostMapping("/savePatient")
	public Mono<Patient> savePatient(@RequestBody AccountInfoModel accountModel) {
		return accountService.savePatient(accountModel);
	}
}
