package com.farabi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farabi.entity.Account;



public interface AccountRepository extends JpaRepository<Account, Integer>{
	

}
