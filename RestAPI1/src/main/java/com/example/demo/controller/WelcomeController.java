package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping(value = "hello")

	public String getDisp()
	{
		return "welcome to you";
	}
	
	// Query String
	 
	@GetMapping(value="welcome")
	
	public String getDispQuery(@RequestParam("uname") String name,@RequestParam("loc") String loc) {
		
		String details="username "+name+" loc "+loc;
		
		return details;
		
	}

}
