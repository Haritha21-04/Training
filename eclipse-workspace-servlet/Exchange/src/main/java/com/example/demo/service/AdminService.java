package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AdminService {
 
    
    private static final String VALID_ADMIN_USERNAME = "u1";
    private static final String VALID_ADMIN_PASSWORD = "p1";
 
    public boolean isValidAdmin(String username, String password) {
        
        return VALID_ADMIN_USERNAME.equals(username) && VALID_ADMIN_PASSWORD.equals(password);
    }
}