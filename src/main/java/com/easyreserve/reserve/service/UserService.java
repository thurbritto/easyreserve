package com.easyreserve.reserve.service;

import com.easyreserve.reserve.dto.UserRequestDTO;
import com.easyreserve.reserve.dto.UserResponseDTO;
import com.easyreserve.reserve.enums.UserRole;
import com.easyreserve.reserve.exception.EmailAlreadyExistsException;
import com.easyreserve.reserve.exception.InvalidPasswordException;
import com.easyreserve.reserve.mapper.UserMapper;
import com.easyreserve.reserve.model.User;
import com.easyreserve.reserve.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {

        // Verify if the given e-mail is already in use
        if (userRepository.findByEmail(userRequestDTO.getEmail()).isPresent()) {
            throw new EmailAlreadyExistsException("E-mail already in use. Try another one.");
        }

        // Verify if the given password has at least 6 characters
        if (userRequestDTO.getPassword().length() < 6) {
            throw new InvalidPasswordException("Password must be at least 6 characters long.");
        }

        User user = userMapper.toEntity(userRequestDTO);
        user.setPassword(passwordEncoder.encode(userRequestDTO.getPassword())); // Encode the user password
        user.setRole(UserRole.CLIENT); // Set the default role

        User savedUser = userRepository.save(user);
        return userMapper.toResponseDTO(savedUser);
    }


}
