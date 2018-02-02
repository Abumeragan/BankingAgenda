package com.BankingAgenda.model.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankingAgenda.model.Bank;

public interface BankDAO extends JpaRepository<Bank, Long> {
	
	Bank findByIdBank(long idLong);

}
