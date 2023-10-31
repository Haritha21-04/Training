package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.Service.AppointmentService;
import com.example.demo.entity.Appointment;

@Controller
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping("/appAppointment")
    public String addAppointment(Appointment appointment) {
        appointmentService.addAppointment(appointment);
        return "redirect:/user_appointment.jsp";
    }

    // Add other request mappings and methods as needed
}
