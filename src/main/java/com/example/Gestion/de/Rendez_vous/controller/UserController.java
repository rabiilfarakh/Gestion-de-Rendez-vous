package com.example.Gestion.de.Rendez_vous.controller;

import com.example.Gestion.de.Rendez_vous.dto.UserDTO;
import com.example.Gestion.de.Rendez_vous.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserDTO register(@RequestBody UserDTO userDTO) {
        return userService.register(userDTO);
    }

    @PostMapping("/login")
    public UserDTO login(@RequestParam String email, @RequestParam String password) {
        return userService.login(email, password);
    }
}
