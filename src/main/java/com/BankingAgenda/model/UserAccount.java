package com.BankingAgenda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "useraccount")
public class UserAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUserAccount;
	private long idUser;
	private long idAccount;

	public UserAccount() {

	}

	public long getIdUserAccount() {
		return idUserAccount;
	}

	public void setIdUserAccount(long idUserAccount) {
		this.idUserAccount = idUserAccount;
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public long getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(long idAccount) {
		this.idAccount = idAccount;
	}

}
