package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;



@Controller
@RequestMapping("/adminLogin")
public class AdminLoginController {

    @PostMapping
    public String adminLogin(HttpServletRequest req, HttpSession session, Model model) {
        try {
            String email = req.getParameter("email");
            String password = req.getParameter("password");

            if ("admin@gmail.com".equals(email) && "admin".equals(password)) {
                session.setAttribute("adminObj", new User());
                return "redirect:/admin/index.jsp";
            } else {
                session.setAttribute("errorMsg", "Invalid email and password");
                return "redirect:/admin_login.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/error.jsp"; // Handle errors gracefully
        }
    }
}
