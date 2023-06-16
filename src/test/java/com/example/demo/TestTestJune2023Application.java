package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTestJune2023Application {

	public static void main(String[] args) {
		SpringApplication.from(TestJune2023Application::main).with(TestTestJune2023Application.class).run(args);
	}

}
