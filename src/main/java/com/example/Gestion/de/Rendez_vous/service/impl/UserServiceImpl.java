package com.example.Gestion.de.Rendez_vous.service.impl;

import com.example.Gestion.de.Rendez_vous.dto.UserDTO;
import com.example.Gestion.de.Rendez_vous.entity.User;
import com.example.Gestion.de.Rendez_vous.mapper.UserMapper;
import com.example.Gestion.de.Rendez_vous.repository.UserRepository;
import com.example.Gestion.de.Rendez_vous.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO register(UserDTO userDTO) {
        User user = userMapper.userDTOToUser(userDTO);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User savedUser = userRepository.save(user);
        return userMapper.userToUserDTO(savedUser);
    }

    @Override
    public UserDTO login(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return userMapper.userToUserDTO(user);
        }
        return null;
    }
}
