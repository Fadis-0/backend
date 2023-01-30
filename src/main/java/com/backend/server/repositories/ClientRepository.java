package com.backend.server.repositories;

import com.backend.server.entities.Client;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
	
}