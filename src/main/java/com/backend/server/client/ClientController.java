package com.backend.server.client;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/client")
public class ClientController {

	@GetMapping
	public List<Client> getClient(){
		return List.of(
				new Client(1L,
				            "Fadi",
				            "ayadfadi@gmail.com",
				            LocalDate.of(2002, Month.OCTOBER, 11),
				            20
				),
				new Client(2L,
				            "Anis",
				            "gasmianis@gmail.com",
				            LocalDate.of(2002, Month.JANUARY, 5),
				            20
				)
			);
	}
	
}