package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
 
@Controller
public class ExchangeRateController {
 
    @GetMapping("/currencyConversion")
    public String showCurrencyConverter() {
        return "currencyConversion";
    }
 
    @PostMapping("/convertCurrency")
    public String convertCurrency(
        @RequestParam("amount") double amount,
        @RequestParam("sourceCurrency") String sourceCurrency,
        @RequestParam("targetCurrency") String targetCurrency,
        Model model) {
 
        // Perform currency conversion here and store the result in the model
        // You can use a currency exchange rate API or a database for conversion
        
        double convertedAmount = performConversion(amount, sourceCurrency, targetCurrency);
        
        model.addAttribute("amount", amount);
        model.addAttribute("sourceCurrency", sourceCurrency);
        model.addAttribute("targetCurrency", targetCurrency);
        model.addAttribute("convertedAmount", convertedAmount);
        
        return "result"; // Create a result JSP to display the conversion result
    }
 
    private double performConversion(double amount, String sourceCurrency, String targetCurrency) {
        
        double conversionRate = 3.30; 
        
        if (sourceCurrency.equals("USD") && targetCurrency.equals("DINAR")) {
            return amount * conversionRate;
        } else if (sourceCurrency.equals("DINAR") && targetCurrency.equals("USD")) {
            return amount / conversionRate;
        } else {
            
            return amount; // No conversion
        }
    }

    }
