package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Doctor;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

    Doctor findByEmailAndPassword(String email, String password);

    List<Doctor> findAllBySpecialist(String specialist);

    // Add other custom query methods if needed
}
