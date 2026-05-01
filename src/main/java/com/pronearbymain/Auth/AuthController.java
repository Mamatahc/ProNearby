package com.pronearbymain.Auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pronearbymain.DTO.SignupRequest;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private AuthService authService;

    
    @PostMapping("/signup")
    public String signup(@RequestBody SignupRequest request) {
    	System.out.println("hitting");
    	return authService.signup(request);
    }
}