package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.StrBean;

@Controller
public class StringExceController {

	// method:url:jsp open

	@GetMapping("inputstr")
	public String inputStr() {
		return "InputString";// jsp name
	}

	@PostMapping("checkpali")
	public String checkPalindrome(StrBean strBean, Model model) {
		// read -> Bean

		// validation
		boolean isError = false;
		if (strBean.getStr() == null || strBean.getStr().isEmpty()) {
			isError = true;
			model.addAttribute("error","Please Enter String");
		}

		// logic ->
		if (!isError) {
			String originalStr = strBean.getStr();

			StringBuffer sb = new StringBuffer(originalStr);
			String revStr = sb.reverse().toString();

			if (originalStr.equals(revStr)) {
				// palindrome
				// send msg / data from controller to jsp
				model.addAttribute("msg", "String is palindrome");
			} else {
				// not palindrome
				model.addAttribute("msg", "string is not palindrome");
			}

			return "ResultPalindrome";
		}else {
			return "InputString";
		}
	}

}
