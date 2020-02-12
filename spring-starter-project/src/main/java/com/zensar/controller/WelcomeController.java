package com.zensar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {
	
	// http://localhost:8080/welcome
	
	@RequestMapping("/")
	public String welcome() {
		return "<h2> Welcome </h2>";
	}
	
	

}
