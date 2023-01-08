package com.rso40.loginservice.controller;

import com.rso40.loginservice.dto.LoginRequest;
import com.rso40.loginservice.dto.LoginResponse;
import com.rso40.loginservice.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/login")
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createLogin(@RequestBody LoginRequest loginRequest){
        loginService.createLogin(loginRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<LoginResponse> getAllLogins() {
        return loginService.getAllLogins();
    }
}
