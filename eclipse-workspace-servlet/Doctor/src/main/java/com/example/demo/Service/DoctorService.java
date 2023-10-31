package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.DoctorRepository;
import com.example.demo.entity.Doctor;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Doctor registerDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor getDoctorById(int id) {
        return doctorRepository.findById(id).orElse(null);
    }

    public Doctor login(String email, String password) {
        return doctorRepository.findByEmailAndPassword(email, password);
    }

    public boolean updateDoctor(Doctor doctor) {
        if (doctorRepository.existsById(doctor.getId())) {
            doctorRepository.save(doctor);
            return true;
        }
        return false;
    }

    @Autowired
    private Doctor doctor; // Assuming you have a DoctorDao

    public boolean deleteDoctor(int id) {
        try {
            return doctor.deleteDoctor(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}

