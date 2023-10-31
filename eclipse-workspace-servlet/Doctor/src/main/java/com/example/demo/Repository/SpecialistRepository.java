package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Specialist;



@Repository
public interface SpecialistRepository extends JpaRepository<Specialist, Integer> {
    // You don't need to define custom query methods for this simple repository
}

