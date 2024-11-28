package org.example.userservice.dto;

import lombok.Value;

@Value
public class UserRequestDTO {
    String firstName;
    String lastName;
    String username;
}