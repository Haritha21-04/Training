package com.example.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExchangeRate {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String localCurrency;
   private String foreignCurrency;
   private Double rate;

   public ExchangeRate() {
       
   }

   public ExchangeRate(String localCurrency, String foreignCurrency, Double rate) {
       this.localCurrency = localCurrency;
       this.foreignCurrency = foreignCurrency;
       this.rate = rate;
   }

   public Long getId() {
       return id;
   }

   public void setId(Long id) {
       this.id = id;
   }

   public String getLocalCurrency() {
       return localCurrency;
   }

   public void setLocalCurrency(String localCurrency) {
       this.localCurrency = localCurrency;
   }

   public String getForeignCurrency() {
       return foreignCurrency;
   }

   public void setForeignCurrency(String foreignCurrency) {
       this.foreignCurrency = foreignCurrency;
   }

   public Double getRate() {
       return rate;
   }

   public void setRate(Double rate) {
       this.rate = rate;
   }

   @Override
   public String toString() {
       return "ExchangeRate{" +
               "id=" + id +
               ", localCurrency='" + localCurrency + '\'' +
               ", foreignCurrency='" + foreignCurrency + '\'' +
               ", rate=" + rate +
               '}';
   }
}

