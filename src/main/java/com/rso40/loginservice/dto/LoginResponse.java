package com.rso40.loginservice.dto;

import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    private  String id;
    private String name;
    private String email;
    private String password;
    private String address;
    private BigDecimal admin;
}
