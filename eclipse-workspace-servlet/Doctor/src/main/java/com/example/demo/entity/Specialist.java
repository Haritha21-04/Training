package com.example.demo.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Specialist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String specialistName;

    // Constructors
    public Specialist() {
        // Default no-arg constructor
    }

    public Specialist(String specialistName) {
        this.specialistName = specialistName;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getSpecialistName() {
        return specialistName;
    }

    public void setSpecialistName(String specialistName) {
        this.specialistName = specialistName;
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "id=" + id +
                ", specialistName='" + specialistName + '\'' +
                '}';
    }
}
