package com.backend.server.controllers;

import com.backend.server.entities.Product;
import com.backend.server.services.ProductService;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping(path="/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("/add")
	public String add(Model model){
		List<Product> products = productService.getAllProducts();
		model.addAttribute("products", products);
		return "product/add";
	}

	@PostMapping("/submit")
	public String formSubmit(@RequestParam String name, @RequestParam String manufacturer, @RequestParam String category, @RequestParam String type, @RequestParam Float price, @RequestParam Integer quantity, @RequestParam String description, Model model){
		productService.saveProduct(name, manufacturer, category, type, price, quantity, description);
		model.addAttribute("message", "Product Added Successfully");
		return "redirect:/product/add";
	}

	
}