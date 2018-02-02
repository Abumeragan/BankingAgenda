package com.BankingAgenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BankingAgenda.model.DAO.UserDAO;

@Controller
public class UserController {
	
	@Autowired
	private UserDAO userDAO;

}
