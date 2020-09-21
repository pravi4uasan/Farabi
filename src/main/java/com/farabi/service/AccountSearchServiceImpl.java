package com.farabi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farabi.entity.Account;
import com.farabi.entity.StatementDetails;
import com.farabi.repo.AccountRepository;

@Service
public class AccountSearchServiceImpl implements AccountSearchService{
	
	@Autowired
	AccountRepository repo;

	public void saveAccountDetails(Account account) {
		
		List<StatementDetails> list=account.getStatementDetails();
		account.setStatementDetails(list);
		
		repo.save(account);
	}

	@Override
	public List<Account> accountDetailsList() {
		
		return repo.findAll();
	}

}
