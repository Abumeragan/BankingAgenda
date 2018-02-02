package com.BankingAgenda.model.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankingAgenda.model.Account;

public interface AccountDAO extends JpaRepository<Account, Long> {
	
}
