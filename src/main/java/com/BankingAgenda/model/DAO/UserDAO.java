package com.BankingAgenda.model.DAO;

import org.springframework.data.repository.CrudRepository;

import com.BankingAgenda.model.User;

public interface UserDAO extends CrudRepository<User, Long>  {

}
