package com.clinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.domain.Account;
import com.clinic.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public Account save(Account accountModel) {
		Account account = new Account();
		account.setAccountId(accountModel.getAccountId());
		account.setAddress(accountModel.getAddress());
		account.setBirth(accountModel.getBirth());
		account.setIsActive(0);
		account.setName(accountModel.getName());
		account.setRole(accountModel.getRole());
		return accountRepository.save(account);
	}
}
