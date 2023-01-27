package com.backend.server.entities;

import org.springframework.data.repository.CrudRepository;
import com.backend.server.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {
	
}