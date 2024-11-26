package com.user.model;

import org.apache.catalina.User;

public class user implements User {
	
	private int id;
	private String cart;
	private String login;
	private String email;
	private String number;
	private String password;
	
	
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}


	public user(int id, String cart, String login, String email, String number, String password) {
		super();
		this.id = id;
		this.cart = cart;
		this.login = login;
		this.email = email;
		this.number = number;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCart() {
		return cart;
	}


	public void setCart(String cart) {
		this.cart = cart;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "user [id=" + id + ", cart=" + cart + ", login=" + login + ", email=" + email + ", number=" + number
				+ ", password=" + password + "]";
	}
	
	

}
