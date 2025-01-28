package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.RegistrationBean;

@Controller
public class ValidationDemoController {

	@GetMapping("/registration")
	public String registration() {
		return "Reg";
	}

	@PostMapping("/register")
	public String register(@Validated  RegistrationBean regBean,BindingResult result) {
		// read
		
		return "";
	}
}
