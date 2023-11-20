package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/")
	public String WelcomePage() {
		return "Welcome To the Testing Page";
		
	}
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Testing the AWS will be Done Here";
		
	}

}
