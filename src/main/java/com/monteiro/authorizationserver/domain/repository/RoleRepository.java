package com.monteiro.authorizationserver.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monteiro.authorizationserver.domain.model.Role;
import com.monteiro.authorizationserver.domain.model.RoleName;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Optional<Role> findByRole(RoleName role);

}
