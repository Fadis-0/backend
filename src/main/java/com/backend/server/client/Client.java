package com.backend.server.client;

import java.util.*;
import java.lang.*;
import java.time.LocalDate;


public class Client {
	// client class attributes
	private Long id;
	private String name;
	private String email;
	private LocalDate dob;
	private Integer age;


	// constructor 1 (with id)
	public Client(Long id, String name, String email, LocalDate dob, Integer age){
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;			
	}

	// constructor 2 (without id)
	public Client(String name, String email, LocalDate dob, Integer age){
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;			
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
	public LocalDate getDob(){
		return dob;
	}
	public Integer getAge(){
		return age;
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
	public void setDob(LocalDate dob){
		this.dob = dob;
	}
	public void setAge(Integer age){
		this.age = age;
	}

	// toString
	@Override
	public String toString(){
		return "Client{" +
			   "id="+ id +
			   ", name='" + name + '\'' +
			   ", email='" + email + '\'' +
			   ", dob='" + dob +
			   ", age=" + age +
			   '}';
	}

}