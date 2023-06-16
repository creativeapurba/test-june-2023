package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	@GetMapping("/")
	public String startPage() {
		return "App is running";
	}
	@GetMapping("/home")
	public String getHome() {
		return "Home route from SpringBoot";
	}
}