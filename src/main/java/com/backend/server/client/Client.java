package com.backend.server.client;

import java.util.*;
import java.lang.*;
import java.time.LocalDate;


public class Client {
	// client class attributes
	private String name;
	private String email;
	private String password;



	// constructor 1 (with id)
	public Client(String name, String email, String password){
		this.name = name;
		this.email = email;
		this.password = password;
	}

	// Getters
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public String getPassword(){
		return password;
	}

	// Setters
	public void setName(String name){
		this.name = name;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setPassword(String password){
		this.password = password;
	}

	// toString
	@Override
	public String toString(){
		return "Client{" +
			   "name='" + name + '\'' +
			   ", email='" + email + '\'' +
			   ", password='" + password + '\'' +
			   '}';
	}

}