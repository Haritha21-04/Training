package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.AdminService;
 
@Controller
public class LoginController {
 
    @Autowired
    private AdminService adminService;
 
    @RequestMapping("/login")
    public String showAdminLoginForm() {
        return "login";
    }
    @GetMapping("/adminDashboard")
    public String dashboardPage() {
        return "dashboard"; 
    }
    @PostMapping("/login")
    public String processAdminLogin(       
        @RequestParam("username") String username,
        @RequestParam("password") String password,
        Model model) {
 
        if (adminService.isValidAdmin(username, password)) {
            
            return "adminDashboard";
        } else {
            model.addAttribute("resultMessage", "Admin login failed");
            return "login";
        }
    }
}