package com.BankingAgenda.model;

public class User {
	
	private long idUser;
	private String name;
	private String password;
	private String email;
	
	
	public User() {
		
	}


	public long getIdUser() {
		return idUser;
	}


	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
