package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.ExchangeRate;
import com.example.demo.repository.ExchangeRateRepository;
 
 
@Service
public class ExchangeRateService {
 
    @Autowired
    private ExchangeRateRepository exchangeRateRepository;
 
    public ExchangeRate addExchangeRate(String localCurrency, String foreignCurrency, Double rate) {
        ExchangeRate exchangeRate = new ExchangeRate();
        exchangeRate.setLocalCurrency(localCurrency);
        exchangeRate.setForeignCurrency(foreignCurrency);
        exchangeRate.setRate(rate);
        return exchangeRateRepository.save(exchangeRate);
    }
}
 