package com.BankingAgenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		ModelAndView model = new ModelAndView("/bankDetail");
		Bank b = bankDAO.findByIdBank(pk);
		model.addObject(b);
		return model;
	}
	
	@GetMapping("bank/edit/{id}")
	public ModelAndView BankEdit(@PathVariable(value = "id") String id) {
		long pk = Long.valueOf(id);
		ModelAndView model = new ModelAndView("/newBank");
		Bank b = bankDAO.findByIdBank(pk);
		model.addObject(b);
		return model;
	}
	
	@PutMapping("bank/update")
	public ModelAndView BankUpdate(@PathVariable(value = "id") String id) {
		//editar para ter o metodo de update do objeto
		ModelAndView model = new ModelAndView("/index");
		return model;
	}
	
	@PostMapping("bank/delete/{id}")
	public String BankDelete(@PathVariable(value = "id") String id) {
		long pk = Long.valueOf(id);
		Bank b = bankDAO.findByIdBank(pk);
		bankDAO.delete(b);
		
		//return to list page
		return "redirect:/banks";
	}
	
	@GetMapping("bank/newBank")
	public String newBank(@ModelAttribute Bank bank) {
		return "/newBank";
	}
	
	@PostMapping("bank/Save")
	public ModelAndView saveBank(Bank bank) {
		//arrumar maneira de salvar o form no banco.
		bankDAO.save(bank);
		ModelAndView model = new ModelAndView("/bankDetail");
		model.addObject(bank);
		return model;
		
	}
	
	
}
