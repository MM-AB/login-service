package com.rso40.loginservice.service;

import com.rso40.loginservice.dto.LoginRequest;
import com.rso40.loginservice.dto.LoginResponse;
import com.rso40.loginservice.model.Login;
import com.rso40.loginservice.repository.LoginRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class LoginService {
    private final LoginRepository loginRepository;

    public void createLogin(LoginRequest loginRequest){
        Login login = Login.builder()
                .name(loginRequest.getName())
                .email(loginRequest.getEmail())
                .password(loginRequest.getPassword())
                .address((loginRequest.getAddress()))
                .admin(loginRequest.getAdmin())
                .build();

        loginRepository.save(login);
        log.info("User {} is saved!", login.getId());

    }

    public List<LoginResponse> getAllLogins() {
        List<Login> logins = loginRepository.findAll();

        return logins.stream().map(this::mapToLoginResponse).toList();
    }

    private LoginResponse mapToLoginResponse(Login login) {
        return LoginResponse.builder()
                .id(login.getId())
                .name(login.getName())
                .email(login.getEmail())
                .password(login.getPassword())
                .address(login.getAddress())
                .admin(login.getAdmin())
                .build();

    }
}
