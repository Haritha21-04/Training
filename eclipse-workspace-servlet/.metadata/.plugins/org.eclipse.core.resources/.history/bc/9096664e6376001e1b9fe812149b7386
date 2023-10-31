package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.User;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User login(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    public boolean checkOldPassword(Integer userId, String oldPassword) {
        User user = userRepository.findById(userId).orElse(null);
        return user != null && user.getPassword().equals(oldPassword);
    }

    public boolean changePassword(int userId, String newPassword) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            user.setPassword(newPassword);
            userRepository.save(user);
            return true;
        }
        return false;
    }
}
