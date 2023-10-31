package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.CurrencyRepository;
import java.util.Currency;
import java.util.List;
import java.util.Optional;

@Service
public class CurrencyService {
    private final CurrencyRepository currencyRepository;

    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public List<Currency> getAllCurrencies() {
        return currencyRepository.findAll();
    }

    public void addCurrency(Currency currency) {
        currencyRepository.save(currency);
    }

    public void updateCurrency(Long currencyId, double newExchangeRate) {
        Optional<Currency> optionalCurrency = currencyRepository.findById(currencyId);
        if (optionalCurrency.isPresent()) {
            Currency currency = optionalCurrency.get();
            currency.setExchangeRate(newExchangeRate);
            currencyRepository.save(currency);
        }
    }

	public List<Currency> getAllCurrencies1() {
		// TODO Auto-generated method stub
		return null;
	}
}