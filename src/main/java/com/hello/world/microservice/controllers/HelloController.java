package com.hello.world.microservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("hello")
	public String index() {
		return "Hello world - Spring Boot";
	}
}
