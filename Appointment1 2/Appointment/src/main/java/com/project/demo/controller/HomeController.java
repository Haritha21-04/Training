package com.project.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
    	return "homepage";
    }
    @GetMapping("/home")
    public String homepage() {
    	return "home";
    }
}