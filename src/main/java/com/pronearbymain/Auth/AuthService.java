package com.pronearbymain.Auth;

import com.pronearbymain.DTO.SignupRequest;
import com.pronearbymain.entity.UserEntity;
import com.pronearbymain.entity.Role;
import com.pronearbymain.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public String signup(SignupRequest request) {

        // 1. Check if email exists
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new RuntimeException("Email already registered!");
        }

        // 2. Convert DTO → Entity
        UserEntity user = new UserEntity();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        // 🔐 safer: always USER
        user.setRole(Role.USER);

        // 3. Save
        userRepository.save(user);

        return "User registered successfully!";
    }
}