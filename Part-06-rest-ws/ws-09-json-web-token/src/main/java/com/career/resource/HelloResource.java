package com.career.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@GetMapping("/hello")
	public String hello() {
		return "oh greate";
	}
}
