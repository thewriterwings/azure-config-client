package com.thewriterwings.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Value("${spring.application.message:Not comming from configservers}")
	private String message;
	
	@GetMapping(value="/")
	public String getHome() {
		return message+"\n";
	}

}
