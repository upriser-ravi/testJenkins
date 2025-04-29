package com.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class firstController {
	
	@GetMapping(value="/path")
	public String showMyMessage(){
		
	return "success-path";		
	}
	
	@GetMapping(value="/new")
	public String neMyMessage(){
		
	return "success-new-path";		
	}
	
	@GetMapping(value="/hello")
	public String helloMessage(){
		
	return "success-hello-ravi-saurabh";		
	}

}
