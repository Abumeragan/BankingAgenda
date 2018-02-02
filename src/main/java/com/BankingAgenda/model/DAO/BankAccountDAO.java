package com.BankingAgenda.model.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankingAgenda.model.BankAccount;

public interface BankAccountDAO extends JpaRepository<BankAccount, Long> {
	
}
