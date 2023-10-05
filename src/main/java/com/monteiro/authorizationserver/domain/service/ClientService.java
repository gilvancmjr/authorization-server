package com.monteiro.authorizationserver.domain.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.stereotype.Service;

import com.monteiro.authorizationserver.api.dto.ClientDto;
import com.monteiro.authorizationserver.api.dto.MessageDto;
import com.monteiro.authorizationserver.domain.model.Client;
import com.monteiro.authorizationserver.domain.repository.ClientRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClientService{ //implements RegisteredClientRepository{
	private final ClientRepository clientRepository;
    private final PasswordEncoder passwordEncoder;

//    @Override
//    public void save(RegisteredClient registeredClient) {
//
//    }
//
//    @Override
//    public RegisteredClient findById(String id) {
//        Client client = clientRepository.findByClientId(id)
//                .orElseThrow(()-> new RuntimeException("client not found"));
//        return Client.toRegisteredClient(client);
//    }
//
//    @Override
//    public RegisteredClient findByClientId(String clientId) {
//        Client client = clientRepository.findByClientId(clientId)
//                .orElseThrow(()-> new RuntimeException("client not found"));
//        return Client.toRegisteredClient(client);
//    }
//
//    public MessageDto create(ClientDto dto){
//        Client client = clientFromDto(dto);
//        clientRepository.save(client);
//        return new MessageDto("client " + client.getClientId() + " saved");
//    }
//
//    // private methods
//    private Client clientFromDto(ClientDto dto){
//        return Client.builder()
//                .clientId(dto.getClientId())
//                .clientSecret(passwordEncoder.encode(dto.getClientSecret()))
//                .authenticationMethods(dto.getAuthenticationMethods())
//                .authorizationGrantTypes(dto.getAuthorizationGrantTypes())
//                .redirectUris(dto.getRedirectUris())
//                .scopes(dto.getScopes())
//                .requireProofKey(dto.isRequireProofKey())
//                .build();
//    }

}
