package com.BankingAgenda.model.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BankingAgenda.model.Account;

@Repository
public interface AccountDAO extends CrudRepository<Account, Long> {
	
}
