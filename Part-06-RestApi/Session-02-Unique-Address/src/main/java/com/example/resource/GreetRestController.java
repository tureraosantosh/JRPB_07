package com.example.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetRestController {
	
	@GetMapping
	public String hello()
	{
		return "Hello how are you";
	}
	
	@GetMapping("/greet")
	public String greet()
	{
		return "Welcome Greet";
	}

}
