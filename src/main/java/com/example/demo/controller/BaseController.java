package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	@GetMapping("/home")
	public String getHome() {
		return "Hello from SpringBoot";
	}
}