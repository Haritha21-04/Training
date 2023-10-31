package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;

@Controller
public class DoctorController {
    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping("/doctor/login")
    public String loginForm(Model model) {
        model.addAttribute("doctor", new Doctor());
        return "doctor/login";
    }

    @PostMapping("/doctor/login")
    public String loginSubmit(@ModelAttribute Doctor doctor, Model model) {
        Doctor existingDoctor = doctorRepository.findByUsername(doctor.getUsername());
        
        if (existingDoctor == null || !existingDoctor.getPassword().equals(doctor.getPassword())) {
            model.addAttribute("error", "Invalid username or password");
            return "doctor/login";
        }
        
        // Redirect to the doctor's dashboard or other appropriate page
        return "redirect:/doctor/dashboard";
    }
}
