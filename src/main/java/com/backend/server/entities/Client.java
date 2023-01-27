package com.backend.server.entities;

import java.util.*;
import java.lang.*;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;



@Entity
@Table(name="client")
public class Client {
	// client class attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;

	@Column(name="email")
	private String email;

	@Column(name="password")
	private String password;


	// constructor 1 (with id)
	public Client(Long id, String name, String email, String password){
		this.name = name;
		this.email = email;
		this.password = password;
	}

	// constructor 2 (without id)
	public Client(String name, String email, String password){
		this.name = name;
		this.email = email;
		this.password = password;
	}

	// Getters
	public Long getId(){
		return id;
	}
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
	public void setId(Long id){
		this.id = id;
	}
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
			   "id=" + id +
			   "name='" + name + '\'' +
			   ", email='" + email + '\'' +
			   ", password='" + password + '\'' +
			   '}';
	}

}