package org.example.userservice.dto;

import lombok.Value;

@Value
public class LoginRequestDTO {
    String username;
    String password;
}