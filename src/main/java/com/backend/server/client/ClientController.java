package com.backend.server.client;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping(path="/api/v1/client")
public class ClientController {
	
	@GetMapping("/signup")
	public String signup(Model model){
		return "signup";
	}

	@PostMapping("/submit")
	public String formSubmit(@ModelAttribute("formData")Client client, Model model){
		model.addAttribute("client", client);
		return "result";
	}

	@GetMapping("/result")
	public String success(Model model){
		return "result";
	}
	
}