package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;



@Controller
public class DoctorLogoutController {

    @GetMapping("/doctorLogout")
    public String doctorLogout(HttpServletRequest req, RedirectAttributes redirectAttributes) {
        HttpSession session = req.getSession();
        session.removeAttribute("doctObj");
        redirectAttributes.addFlashAttribute("succMsg", "Doctor Logout Successfully");
        return "redirect:/doctor_login"; // Redirect to the doctor login page
    }
}
