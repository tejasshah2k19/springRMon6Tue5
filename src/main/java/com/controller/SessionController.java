package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionController {

	@GetMapping("/signup")
	public String signupPage() {
		
		return "Signup";//jsp name 
	}
}

 