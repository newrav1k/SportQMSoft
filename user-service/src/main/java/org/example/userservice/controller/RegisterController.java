package org.example.userservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/register")
public class RegisterController {

    @GetMapping
    public String register() {
        return "Register successful";
    }

    @PostMapping
    public String processRegistration() {
        return "redirect:/login";
    }

}