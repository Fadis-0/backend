package com.backend.server.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.backend.server.entities.Product;
import com.backend.server.repositories.ProductRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService{
	@Autowired
	private ProductRepository productRepository;

	public void saveProduct(String nom, String manufacturer, String category, String type, Float price, Integer quantity, String description){
		Product product = new Product(nom, manufacturer, category, type, price, quantity, description);
		productRepository.save(product);
	}

	public List<Product> getAllProducts() {
		List<Product> productList = StreamSupport.stream(productRepository.findAll().spliterator(), false).collect(Collectors.toList());
		return productList;
	}
}