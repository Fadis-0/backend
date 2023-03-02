package com.backend.server.entities;

import java.util.*;
import java.lang.*;
import java.time.LocalDate;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;


@Data
@Entity
@Table(name="product")
public class Product {
	// product class attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;

	@Column(name="manufacturer")
	private String manufacturer;

	@Column(name="category")
	private String category;

	@Column(name="type")
	private String type;

	@Column(name="price")
	private Float price;

	@Column(name="quantity")
	private Integer quantity;

	@Column(name="description")
	private String description;


	
	public Product() {}


	// constructor 1 (with id)
	public Product(Long id, String name, String manufacturer, String category, String type, Float price, Integer quantity, String description){
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.category = category;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}

	// constructor 2 (without id)
	public Product(String name, String manufacturer, String category, String type, Float price, Integer quantity, String description){
		this.name = name;
		this.manufacturer = manufacturer;
		this.category = category;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}
	/*
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
	*/

} 