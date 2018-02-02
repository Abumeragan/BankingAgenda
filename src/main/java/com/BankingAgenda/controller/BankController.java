package com.BankingAgenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.BankingAgenda.model.Bank;
import com.BankingAgenda.model.DAO.BankDAO;

@Controller
public class BankController {
	
	@Autowired
	 private BankDAO bankDAO;
		
	@GetMapping("")
	public ModelAndView bankList() {
		ModelAndView model = new ModelAndView("/index");
		List<Bank> banks = bankDAO.findAll();
		model.addObject("banks", banks);

		return model;
	}
	
	@GetMapping("bank/detail/{id}")
	public ModelAndView bankDetails(@PathVariable(value = "id") String id) {
		long pk = Long.valueOf(id);
		ModelAndView model = new ModelAndView("/productDetail");
		Bank b = bankDAO.findByIdBank(pk);
		model.addObject(b);
		return model;
	}
	
	@GetMapping("bank/edit/{id}")
	public ModelAndView BankEdit(@PathVariable(value = "id") String id) {
		long pk = Long.valueOf(id);
		ModelAndView model = new ModelAndView("/productDetail");
		Bank b = bankDAO.findByIdBank(pk);
		model.addObject(b);
		return model;
	}
	
	@GetMapping("bank/delete/{id}")
	public ModelAndView BankDelete(@PathVariable(value = "id") String id) {
		long pk = Long.valueOf(id);
		ModelAndView model = new ModelAndView("/productDetail");
		Bank b = bankDAO.findByIdBank(pk);
		model.addObject(b);
		return model;
	}
	
	@GetMapping("bank/new")
	public ModelAndView BankNew(@PathVariable(value = "id") String id) {
		long pk = Long.valueOf(id);
		ModelAndView model = new ModelAndView("/productDetail");
		Bank b = bankDAO.findByIdBank(pk);
		model.addObject(b);
		return model;
	}
	
	
	
}
