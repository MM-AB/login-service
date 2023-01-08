package com.rso40.loginservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Document(value = "login")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Login {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private String address;
    private BigDecimal admin;

}