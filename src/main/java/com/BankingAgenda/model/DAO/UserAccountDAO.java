package com.BankingAgenda.model.DAO;

import org.springframework.data.repository.CrudRepository;

import com.BankingAgenda.model.UserAccount;

public interface UserAccountDAO extends CrudRepository<UserAccount, Long>  {

}
