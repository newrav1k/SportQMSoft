package org.example.userservice.mapper;

import org.example.userservice.dto.UserDTO;
import org.example.userservice.entity.PersonalInfo;
import org.example.userservice.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserReadMapper implements Mapper<User, UserDTO> {
    @Override
    public UserDTO map(User user) {
        return new UserDTO(
                PersonalInfo.builder()
                        .firstName(user.getPersonalInfo().getFirstName())
                        .lastName(user.getPersonalInfo().getLastName())
                        .username(user.getPersonalInfo().getUsername())
                        .phoneNumber(user.getPersonalInfo().getPhoneNumber())
                        .password(user.getPersonalInfo().getPassword())
                        .build()
        );
    }
}