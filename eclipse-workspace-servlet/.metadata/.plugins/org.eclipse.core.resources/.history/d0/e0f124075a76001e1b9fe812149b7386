package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.SpecialistRepository;
import com.example.demo.entity.Specialist;

import java.util.List;

@Service
public class SpecialistService {

    private final SpecialistRepository specialistRepository;

    public SpecialistService(SpecialistRepository specialistRepository) {
        this.specialistRepository = specialistRepository;
    }

    public Specialist addSpecialist(Specialist specialist) {
        return specialistRepository.save(specialist);
    }

    public List<Specialist> getAllSpecialists() {
        return specialistRepository.findAll();
    }

    // Add other service methods as needed
}
