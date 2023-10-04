package com.monteiro.authorizationserver.api.dto;

import java.util.List;

public record AppUserDto(

		String username, String password, List<String> roles) {
}
