package com.Portal.loan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    @GetMapping({"/dashboard"})
	public String contact() {
		
		return "dashboard";
	}
    
}
