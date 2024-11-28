package org.example.userservice.mapper;

import lombok.RequiredArgsConstructor;
import org.example.userservice.dto.UserDTO;
import org.example.userservice.entity.PersonalInfo;
import org.example.userservice.entity.User;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserCreateEditMapper implements Mapper<UserDTO, User> {
    @Override
    public User map(UserDTO from) {
        return User.builder()
                .personalInfo(
                        PersonalInfo.builder()
                                .firstName(from.getPersonalInfo().getFirstName())
                                .lastName(from.getPersonalInfo().getLastName())
                                .username(from.getPersonalInfo().getUsername())
                                .phoneNumber(from.getPersonalInfo().getPhoneNumber())
                                .password(from.getPersonalInfo().getPassword())
                                .build()
                )
                .build();
    }
}