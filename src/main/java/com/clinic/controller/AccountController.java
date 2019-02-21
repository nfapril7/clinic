package com.clinic.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.domain.Account;
import com.clinic.exception.CustomException;
import com.clinic.service.AccountService;
import com.clinic.support.Constant;
import com.clinic.support.MessageOutput;

@RestController
@RequestMapping("/clinic/account")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@PostMapping("/save")
	public HttpEntity<MessageOutput> saveAccout(@RequestBody Account accountModel) {
		MessageOutput mo = new MessageOutput();
		try {
			Account account = accountService.save(accountModel);
			if(account==null) {
				throw new CustomException("Saving data failed");
			}			
			mo.setData(account);
			mo.setMessage("Save data successfully");
			mo.setStatus(Constant.SUCCESS);			
		}catch(Exception ex) {
			//LOG+ex
			mo.setData("Data not found");
			mo.setMessage("Save data failed");
			mo.setStatus(Constant.ERROR);	
		}
		return new ResponseEntity<>(mo, HttpStatus.OK);	
	}
}
