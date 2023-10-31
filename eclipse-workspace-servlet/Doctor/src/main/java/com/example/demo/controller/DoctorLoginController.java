package com.example.demo.controller;



import jakarta.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.Doctor;

@Controller
@RequestMapping("/doctorLogin")
public class DoctorLoginController {

    public DoctorLoginController(Doctor doctorDao) {
    }

    @PostMapping
    public String doctorLogin(HttpServletRequest req, RedirectAttributes redirectAttributes, Model model) {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        Doctor doctor = Doctor.login(email, password);

        if (doctor != null) {
            req.getSession().setAttribute("doctObj", doctor);
            return "redirect:/doctor/index"; // Redirect to the doctor's index page
        } else {
            redirectAttributes.addFlashAttribute("errorMsg", "Invalid email & password");
            return "redirect:/doctor_login"; // Redirect back to the doctor login page
        }
    }
}
