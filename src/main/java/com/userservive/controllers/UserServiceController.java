package com.userservive.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {

	@GetMapping("/users")
	public Map<String,String> getUser(){
		Map<String,String> output = new HashMap();
		
		
		return output;
	}
} 
