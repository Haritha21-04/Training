package com.example.demo.controller;
import java.util.Currency;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.services.CurrencyService;

@Controller
public class CurrencyController {
    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/dashboard")
    public String userDashboard(Model model) {
        List<Currency> currencies = currencyService.getAllCurrencies();
        model.addAttribute("currencies", currencies);
        return "dashboard";
    }

    @PostMapping("/addCurrency")
    public String addCurrency(@RequestParam String currencyName, @RequestParam double exchangeRate) {
        Currency currency = new Currency(currencyName, exchangeRate);
        currencyService.addCurrency(currency);
        return "redirect:/dashboard";
    }

    @PostMapping("/updateCurrency")
    public String updateCurrency(@RequestParam Long currencyId, @RequestParam double newExchangeRate) {
        currencyService.updateCurrency(currencyId, newExchangeRate);
        return "redirect:/dashboard";
    }
}
