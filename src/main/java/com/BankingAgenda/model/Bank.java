package com.BankingAgenda.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name = "bank")
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idBank;
	private String name;
	@Transient
	private List<Account> Accounts;

	public Bank() {

	}

	public long getIdBank() {
		return idBank;
	}

	public void setIdBank(long idBank) {
		this.idBank = idBank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return Accounts;
	}

	public void setAccounts(List<Account> accounts) {
		Accounts = accounts;
	}

}
