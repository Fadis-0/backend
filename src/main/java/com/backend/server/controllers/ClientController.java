package com.backend.server.controllers;

import com.backend.server.services.ClientService;

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
@RequestMapping(path="/client")
public class ClientController {
	
	@Autowired
	private ClientService clientService;

	@GetMapping("/signup")
	public String signup(Model model){
		return "client/signup";
	}

	@PostMapping("/submit")
	public String formSubmit(@RequestParam String name, @RequestParam String email, @RequestParam String password, Model model){
		clientService.saveClient(name, email, password);
		return "redirect:/client/success";
	}

	@GetMapping("/success")
	public String success(Model model){
		model.addAttribute("message", "Form Submitted successfully");
		return "client/result";
	}
	
}