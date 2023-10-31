package com.example.demo.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Currency {
    @Id
    private Long id;
    private String name;
    private double exchangeRate;

    public Currency() {
        
    }

    public Currency(Long id, String name, double exchangeRate) {
        this.id = id;
        this.name = name;
        this.exchangeRate = exchangeRate;
    }

   
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}

