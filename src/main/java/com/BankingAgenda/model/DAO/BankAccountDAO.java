package com.BankingAgenda.model.DAO;

import org.springframework.data.repository.CrudRepository;

import com.BankingAgenda.model.BankAccount;

public interface BankAccountDAO extends CrudRepository<BankAccount, Long> {

}
