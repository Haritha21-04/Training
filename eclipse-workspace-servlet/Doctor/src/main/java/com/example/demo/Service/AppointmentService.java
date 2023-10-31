package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.AppointmentRepository;
import com.example.demo.entity.Appointment;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public boolean addAppointment(Appointment ap) {
        try {
            appointmentRepository.save(ap);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Appointment> getAllAppointmentsByUserId(int userId) {
        return appointmentRepository.findByUserId(userId);
    }

    public List<Appointment> getAllAppointmentsByDoctorId(int doctorId) {
        return appointmentRepository.findByDoctorId(doctorId);
    }

    public Appointment getAppointmentById(int id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    public boolean updateCommentStatus(int id, int doctId, String comm) {
        try {
            Appointment appointment = appointmentRepository.findById(id).orElse(null);
            if (appointment != null && appointment.getDoctorId() == doctId) {
                appointment.setStatus(comm);
                appointmentRepository.save(appointment);
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }
}

