package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	@GetMapping("/")
	public String run() {
		return "<h1>WELCOME TO SPRINGBOOT</h1>";
	}

	@GetMapping("/user")
	public String user() {
		return "<H1>THIS IS USER</H1>";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "<H1>THIS IS ADMIN</H1>";
	}
	@GetMapping("/manager")
	public String manager() {
		return " <H1>THIS IS MANAGER</H1>";
	}
}
