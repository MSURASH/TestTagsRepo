package com.java.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllers {
	
	@GetMapping("/")
	public String print() {
		return "V2 Tag";
	}

}
