package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.MathBean;

@Controller
public class MathsController {

	// two input
	// addition print - output

	@GetMapping("/input")
	public String inputNum() {
		return "InputNum";// jsp name
	}

	@PostMapping("/addition")
	public String addition(MathBean mathBean,Model model) {
		// read two numbers
		// validate
		// process

		// request.getParameter("n1")
		// class->MathBean -> variable -> object
		// SignupBean
		// LoginBean
		// method argument
		System.out.println(mathBean.getN1());
		System.out.println(mathBean.getN2());
		Integer ans = mathBean.getN1() + mathBean.getN2();
		System.out.println(ans);
		
		//send data from controller -> jsp 
		model.addAttribute("ans",ans);
		
		return "Ans";
	}

}
