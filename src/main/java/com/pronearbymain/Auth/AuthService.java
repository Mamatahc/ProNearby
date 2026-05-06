package com.pronearbymain.Auth;

import com.pronearbymain.DTO.OtpRequest;
import com.pronearbymain.DTO.SignupRequest;
import com.pronearbymain.entity.UserEntity;
import com.pronearbymain.entity.Role;
import com.pronearbymain.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private EmailService emailService;

    public String signup(SignupRequest request) {

        // 1. Check email
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            return "User already exists!";
        }

        // 2. Generate OTP
        String otp = generateOtp();
        System.out.println("OTP Generated: " + otp);

        // 3. Send OTP
        emailService.sendOtp(request.getEmail(), otp);

        // 4. Convert DTO → Entity
        UserEntity user = new UserEntity();
        user.setName(request.getName());
        user.setEmail(request.getEmail());

        // 🔐 Encrypt password
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        user.setRole(Role.USER);

        // ✅ Store OTP + verification flag
        user.setOtp(otp);
        user.setIsVerified(false);   // ✅ FIXED

        // 5. Save
        userRepository.save(user);

        return "User registered successfully! OTP sent to email.";
    }  
       private String generateOtp() {
        return String.valueOf((int)(Math.random() * 9000) + 1000);
    }
       
       public String verifyOtp(OtpRequest request) {

    	    // 1. Find user by email
    	    UserEntity user = userRepository.findByEmail(request.getEmail())
    	            .orElseThrow(() -> new RuntimeException("User not found"));

    	    // 2. Check OTP
    	    if (user.getOtp() != null && user.getOtp().equals(request.getOtp())) {

    	        // 3. Mark user as verified
    	        user.setIsVerified(true);

    	        // 4. Clear OTP (important)
    	        user.setOtp(null);

    	        userRepository.save(user);

    	        return "OTP Verified Successfully ✅";
    	    }

    	    return "Invalid OTP ❌";
    	}
}