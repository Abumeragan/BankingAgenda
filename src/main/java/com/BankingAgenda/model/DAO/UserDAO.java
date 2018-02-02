package com.BankingAgenda.model.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankingAgenda.model.User;

public interface UserDAO extends JpaRepository<User, Long> {
	
}
