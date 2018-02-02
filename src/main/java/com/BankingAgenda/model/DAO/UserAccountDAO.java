package com.BankingAgenda.model.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankingAgenda.model.UserAccount;

public interface UserAccountDAO extends JpaRepository<UserAccount, Long> {
	
}
