package org.example.userservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.userservice.dto.UserRequestDTO;
import org.example.userservice.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserRequestDTO>> findAllUsers() {
        List<UserRequestDTO> userRequestDTOS = userService.findAll().stream().map(user -> new UserRequestDTO(
                user.getPersonalInfo().getFirstName(),
                user.getPersonalInfo().getLastName(),
                user.getPersonalInfo().getUsername()
        )).toList();
        return ResponseEntity.ok(userRequestDTOS);
    }

}