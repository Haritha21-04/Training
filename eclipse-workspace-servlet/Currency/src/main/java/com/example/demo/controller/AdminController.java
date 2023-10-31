package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class AdminController {
 
    @GetMapping("/adminLogin")
    public String showAdminLogin() {
        return "adminLogin";
    }
 
    @PostMapping("/adminLogin")
    public ModelAndView loginAdmin(@RequestParam("username") String username, @RequestParam("password") String password) {
        // Implement admin authentication logic here
        if (isValidAdmin(username, password)) {
            // Redirect to admin dashboard or any other admin-related page
            return new ModelAndView("redirect:/adminDashboard");
        } else {
            // If authentication fails, redirect back to the login page with an error message
            ModelAndView modelAndView = new ModelAndView("adminLogin");
            modelAndView.addObject("error", "Invalid username or password");
            return modelAndView;
        }
    }
 
    private boolean isValidAdmin(String username, String password) {
        // Implement your admin authentication logic here
        // Check the username and password against your admin database or any other source
        // For this example, we'll assume a hardcoded admin
        return "admin".equals(username) && "password".equals(password);
    }
}
 