
package com.example.demo.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.ExchangeRateService;

 
@Controller
public class ExchangeRateController1 {
 
    @Autowired
    private ExchangeRateService exchangeRateService;
 
    @GetMapping("/addContent")
    public String showAddContentForm() {
        return "addContent";
    }
 
    @PostMapping("/addContent")
    public String addContent(
        ) {
 
        
        return "addContent";
    }
}
 