package com.BankingAgenda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "bankaccount")
public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idBankAccount;
	private long idBank;
	private long idAccount;

	public BankAccount() {

	}

	public long getIdBankAccount() {
		return idBankAccount;
	}

	public void setIdBankAccount(long idBankAccount) {
		this.idBankAccount = idBankAccount;
	}

	public long getIdBank() {
		return idBank;
	}

	public void setIdBank(long idBank) {
		this.idBank = idBank;
	}

	public long getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(long idAccount) {
		this.idAccount = idAccount;
	}

}
