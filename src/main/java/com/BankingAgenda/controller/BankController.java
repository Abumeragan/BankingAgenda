package com.BankingAgenda.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

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
		ModelAndView model = new ModelAndView("/bankDetail");
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
	
	@GetMapping("bank/newBank")
	public String newBank(@ModelAttribute Bank bank) {
		return "/newBank";
	}
	
	@PostMapping
	public ModelAndView saveBank() {
		//arrumar maneira de salvar o form no banco.
		ModelAndView model = new ModelAndView("/bankDetail");
		Bank b = new Bank();
		
		model.addObject(b);
		return model;
	}
	
	
}
