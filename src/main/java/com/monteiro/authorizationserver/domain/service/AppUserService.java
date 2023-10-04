package com.monteiro.authorizationserver.domain.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.monteiro.authorizationserver.api.dto.AppUserDto;
import com.monteiro.authorizationserver.api.dto.MessageDto;
import com.monteiro.authorizationserver.domain.model.AppUser;
import com.monteiro.authorizationserver.domain.model.Role;
import com.monteiro.authorizationserver.domain.model.RoleName;
import com.monteiro.authorizationserver.domain.repository.AppUserRepository;
import com.monteiro.authorizationserver.domain.repository.RoleRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class AppUserService {
	
	@Autowired
	private final AppUserRepository appUserRepository;
	@Autowired
	private final RoleRepository roleRepository;
	@Autowired
	private final PasswordEncoder passwordEncoder;
	
	public MessageDto createUser(AppUserDto dto) {
		AppUser appUser = AppUser.builder()
				.username(dto.username())
				.password(passwordEncoder.encode(dto.password()))
				.build();
		Set<Role> roles = new HashSet<>();
		dto.roles().forEach(r -> {
			Role role = roleRepository.findByRole(RoleName.valueOf(r)).orElseThrow(() -> new RuntimeException("role not found"));
			roles.add(role);
		});
		appUser.setRoles(roles);
		appUserRepository.save(appUser);
		return new MessageDto("user "+ appUser.getUsername() + " saved");
		
	}

}
