package com.bean;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class RegistrationBean {

	@NotBlank(message = "Please Enter FirstName")
	@Length(min = 2,message = "Please Enter valid name")
	@Pattern(regexp = "[a-zA-Z]+",message = "Please use only alphabets")
	private String firstName;
	
	@NotBlank(message = "Please Enter Email")
	private String email;

	@NotBlank(message = "Please Enter Password")
	@Length(min = 8,message = "Password should be atleast 8 in length")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
