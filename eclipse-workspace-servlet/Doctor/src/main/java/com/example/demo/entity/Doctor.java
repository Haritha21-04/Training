package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;




@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fullName;
    private String dob;
    private String qualification;
    private String specialist;
    private String email;
    private String mobNo;
    private String password;

    // Constructors
    public Doctor() {
        // Default no-arg constructor
    }

    public Doctor(String fullName, String dob, String qualification, String specialist, String email, String mobNo, String password) {
        this.fullName = fullName;
        this.dob = dob;
        this.qualification = qualification;
        this.specialist = specialist;
        this.email = email;
        this.mobNo = mobNo;
        this.password = password;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dob='" + dob + '\'' +
                ", qualification='" + qualification + '\'' +
                ", specialist='" + specialist + '\'' +
                ", email='" + email + '\'' +
                ", mobNo='" + mobNo + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

	public static Doctor login(String email2, String password2) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteDoctor(int id2) {
		// TODO Auto-generated method stub
		return false;
	}
}
