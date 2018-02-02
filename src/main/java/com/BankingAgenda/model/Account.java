package com.BankingAgenda.model;

public class Account {
	
	private long idAccount;
	private String name;
	private String agency;
	private String account;
	private String type;
	private boolean personalAccount;
	
	public Account() {
		
	}

	public long getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(long idAccount) {
		this.idAccount = idAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isPersonalAccount() {
		return personalAccount;
	}

	public void setPersonalAccount(boolean personalAccount) {
		this.personalAccount = personalAccount;
	}
	
	
	
	

}
