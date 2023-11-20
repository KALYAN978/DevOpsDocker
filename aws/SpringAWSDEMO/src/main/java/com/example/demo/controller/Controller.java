package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping("/")
	public String welcomePage() {
		return "WELCOME TO THE AWS testing CENTER";
	}

	@GetMapping("/hello")
	public String helloWorld() {
		return "TESTING AWS";
	}
}
