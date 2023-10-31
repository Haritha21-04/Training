package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Repository.DoctorRepository;
import com.example.demo.entity.Doctor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/addDoctor")
public class AddDoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @PostMapping
    public String addDoctor(HttpServletRequest req, HttpSession session, Model model) {
        try {
            String fullName = req.getParameter("fullname");
            String dob = req.getParameter("dob");
            String qualification = req.getParameter("qualification");
            String spec = req.getParameter("spec");
            String email = req.getParameter("email");
            String mobno = req.getParameter("mobno");
            String password = req.getParameter("password");

            Doctor d = new Doctor(fullName, dob, qualification, spec, email, mobno, password);

            if (doctorRepository.save(d) != null) {
                session.setAttribute("succMsg", "Doctor Added Successfully..");
            } else {
                session.setAttribute("errorMsg", "Something went wrong on the server");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:/admin/doctor.jsp"; // Assuming you have a Thymeleaf or JSP template
    }
}
