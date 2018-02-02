package com.BankingAgenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BankingAgenda.model.DAO.BankDAO;

@RestController
public class HelloController {
	
	@Autowired
	 private BankDAO bdao;
		
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Banks!!!!";
	}
	
	
	
}
