package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.RegistrationBean;

@Controller
public class ValidationDemoController {

	// registration with validation

	// open jsp
	@GetMapping("registration")
	public String registration() {

		return "Reg";
	}

	@PostMapping("saveuser1")
	public String saveUser(@Validated RegistrationBean registrationBean, BindingResult result, Model model) {

		// validation success ? fail ?

		if (result.hasErrors()) {
			// true -> error
			model.addAttribute("result", result);
			model.addAttribute("user",registrationBean);
			return "Reg";

		} else {
			// false -> no error
			//business logic 
			//save data into database 
			
			return "Login";
		}

	}
}
