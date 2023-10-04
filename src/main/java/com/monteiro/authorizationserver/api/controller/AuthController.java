package com.monteiro.authorizationserver.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monteiro.authorizationserver.api.dto.AppUserDto;
import com.monteiro.authorizationserver.api.dto.MessageDto;
import com.monteiro.authorizationserver.domain.service.AppUserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

	private final AppUserService appUserService;

	public ResponseEntity<MessageDto> createUser(@RequestBody AppUserDto dto) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(appUserService.createUser(dto));

	}

}
