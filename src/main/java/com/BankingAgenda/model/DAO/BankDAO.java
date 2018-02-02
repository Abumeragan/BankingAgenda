package com.BankingAgenda.model.DAO;

import org.springframework.data.repository.CrudRepository;

import com.BankingAgenda.model.Bank;

public interface BankDAO extends CrudRepository<Bank, Long>  {

}
