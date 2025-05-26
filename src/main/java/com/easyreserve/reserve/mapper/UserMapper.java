package com.easyreserve.reserve.mapper;

import com.easyreserve.reserve.dto.UserRequestDTO;
import com.easyreserve.reserve.dto.UserResponseDTO;
import com.easyreserve.reserve.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {

    private final PasswordEncoder passwordEncoder;

    public User toEntity(UserRequestDTO userRequestDTO) {
        return new User(
                userRequestDTO.getName(),
                userRequestDTO.getEmail(),
                userRequestDTO.getPassword(),
                null);
    }

    public UserResponseDTO toResponseDTO(User user) {
        return new UserResponseDTO(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }

}
