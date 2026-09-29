package com.springboot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to the Spring Boot CI/CD Application!";
	}

}
