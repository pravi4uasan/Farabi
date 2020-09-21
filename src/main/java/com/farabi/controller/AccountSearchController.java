package com.farabi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.farabi.entity.Account;
import com.farabi.service.AccountSearchService;

@RestController
public class AccountSearchController {
	
	@Autowired
	AccountSearchService accountSearchService;
	
	@PostMapping(value="/saveaccount" ,produces = MediaType.APPLICATION_JSON_VALUE ,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveaccount(@RequestBody Account account) {
		accountSearchService.saveAccountDetails(account);
		
	}
	
	@GetMapping(value="/accountdetails",produces = MediaType.APPLICATION_JSON_VALUE ,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Account> accountDetailsList(){
		List<Account> accountList=accountSearchService.accountDetailsList();
		return accountList;
		
	}
	
	public List<Account> search(){
		return null;
		
	}

}
