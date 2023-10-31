package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String fullName;
    private String gender;
    private String age;
    private String appointDate;
    private String email;
    private String phNo;
    private String diseases;
    private Long doctorId;
    private String address;
    private String status;

    // Constructors
    public Appointment() {
        // Default no-arg constructor
    }

    public Appointment(Long userId, String fullName, String gender, String age, String appointDate, String email,
                      String phNo, String diseases, Long doctorId, String address, String status) {
        this.userId = userId;
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.appointDate = appointDate;
        this.email = email;
        this.phNo = phNo;
        this.diseases = diseases;
        this.doctorId = doctorId;
        this.address = address;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAppointDate() {
        return appointDate;
    }

    public void setAppointDate(String appointDate) {
        this.appointDate = appointDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", userId=" + userId +
                ", fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", appointDate='" + appointDate + '\'' +
                ", email='" + email + '\'' +
                ", phNo='" + phNo + '\'' +
                ", diseases='" + diseases + '\'' +
                ", doctorId=" + doctorId +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
