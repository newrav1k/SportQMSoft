package org.example.userservice.dto;

import lombok.Value;
import org.example.userservice.entity.PersonalInfo;

@Value
public class UserDTO {
    PersonalInfo personalInfo;
}