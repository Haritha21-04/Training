package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.UserService;
import com.example.demo.entity.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService; // Inject the UserService

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Define an endpoint for user registration
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        // Validate and register the user using the UserService
        if (userService.registerUser(user) != null) {
            return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("User registration failed", HttpStatus.BAD_REQUEST);
        }
    }

    // Define an endpoint for user login
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User user) {
        // Validate and log in the user using the UserService
        if (userService.login(user.getEmail(), user.getPassword()) != null) {
            return new ResponseEntity<>("User logged in successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Login failed. Invalid credentials.", HttpStatus.UNAUTHORIZED);
        }
    }

    // Define an endpoint for changing the user's password
    @PutMapping("/change-password/{userId}")
    public ResponseEntity<String> changePassword(
            @PathVariable Integer userId,
            @RequestParam String oldPassword,
            @RequestParam String newPassword) {
        // Check if the old password is correct
        if (userService.checkOldPassword(userId, oldPassword)) {
            // Change the password using the UserService
            if (userService.changePassword(userId, newPassword)) {
                return new ResponseEntity<>("Password changed successfully", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Password change failed", HttpStatus.BAD_REQUEST);
            }
        } else {
            return new ResponseEntity<>("Invalid old password", HttpStatus.UNAUTHORIZED);
        }
    }
}
