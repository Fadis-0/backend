package com.backend.server.entities;

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
@RequestMapping(path="/api/v1/client")
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;

	@GetMapping("/signup")
	public String signup(Model model){
		return "signup";
	}

	@PostMapping("/submit")
	public String formSubmit(@RequestParam String name, @RequestParam String email, @RequestParam String password, Model model){
		Client client = new Client(name, email, password);
		clientRepository.save(client);
		model.addAttribute("message", "Form Submitted successfully");

		return "result";
	}

	@GetMapping("/result")
	public String success(Model model){
		return "result";
	}
	
}