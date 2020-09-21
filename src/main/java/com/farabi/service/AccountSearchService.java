package com.farabi.service;

import java.util.List;

import com.farabi.entity.Account;

public interface AccountSearchService {
	
	public void saveAccountDetails(Account account);
	
	public List<Account> accountDetailsList();

}
