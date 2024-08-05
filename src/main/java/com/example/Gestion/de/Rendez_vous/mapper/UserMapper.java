package com.example.Gestion.de.Rendez_vous.mapper;

import com.example.Gestion.de.Rendez_vous.dto.UserDTO;
import com.example.Gestion.de.Rendez_vous.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);

    User userDTOToUser(UserDTO userDTO);
}
