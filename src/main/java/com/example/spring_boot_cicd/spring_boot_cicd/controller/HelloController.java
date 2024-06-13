package com.example.spring_boot_cicd.spring_boot_cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/welcome")
	public String getMessage() {
		return "Welcome to my code";
	}
}
