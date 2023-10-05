package com.monteiro.authorizationserver.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monteiro.authorizationserver.domain.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
	
	Optional<Client> findByClientId(String clientId);

	

}
