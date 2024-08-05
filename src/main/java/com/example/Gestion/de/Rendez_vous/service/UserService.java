package com.example.Gestion.de.Rendez_vous.service;

import com.example.Gestion.de.Rendez_vous.dto.UserDTO;
import com.example.Gestion.de.Rendez_vous.entity.User;

public interface UserService {
    UserDTO register(UserDTO userDTO);
    UserDTO login(String email,String password);
}
