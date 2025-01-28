package com.bean;

import jakarta.validation.constraints.NotBlank;

public class RegistrationBean {

	@NotBlank(message = "Please Enter FirstName")
	private String firstName;

	@NotBlank(message = "Please Enter Email")
	private String email;

	@NotBlank(message = "Please Enter Password")
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
