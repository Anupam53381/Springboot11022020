package com.zensar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	// http://localhost:8080/
	
	@RequestMapping("/")
	public String sayHello() {
		return "<h1> Welcome to Spring Boot </h1>";
	}

}
