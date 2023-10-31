package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Service.SpecialistService;
import com.example.demo.entity.Specialist;

import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/addSpecialist")
public class AddSpecialistController {

    @Autowired
    private SpecialistService specialistService; // Assuming you have a SpecialistService class

    @PostMapping
    public String addSpecialist(String specName, HttpSession session, Model model) {
        try {
            Specialist specialist = new Specialist();
            specialist.setSpecialistName(specName);

            if (specialistService.addSpecialist(specialist) != null) {
                session.setAttribute("succMsg", "Specialist Added Successfully");
            } else {
                session.setAttribute("errorMsg", "Something went wrong on the server");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:/admin/index.jsp"; // Redirect to the appropriate page
    }
}
