package com.backend.server.services;

import com.backend.server.entities.Client;
import com.backend.server.repositories.ClientRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService{
	@Autowired
	private ClientRepository clientRepository;

	public void saveClient(String nom, String email, String password){
		Client client = new Client(nom, email, password);
		clientRepository.save(client);
	}
}