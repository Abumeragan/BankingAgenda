package com.BankingAgenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BankingAgenda.model.DAO.AccountDAO;

@Controller
public class AccountController {
	
	@Autowired
	private AccountDAO accountDAO;

}
