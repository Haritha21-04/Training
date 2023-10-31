package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;

@Controller
public class AdminLogoutController {

    @GetMapping("/adminLogout")
    public String adminLogout(HttpSession session, Model model) {
        session.removeAttribute("adminObj");
        session.setAttribute("succMsg", "Admin Logout Successfully");
        return "redirect:/admin_login.jsp"; // Assuming you have an admin_login.jsp page
    }
}
