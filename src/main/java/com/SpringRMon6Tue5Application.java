package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@SpringBootApplication
public class SpringRMon6Tue5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRMon6Tue5Application.class, args);
	}

	@Bean
	public Cloudinary getCloudinary() {
		return new Cloudinary(ObjectUtils.asMap("cloud_name", "dzko8yjs6", "api_key", "812235955324293",
				"api_secret", "myUUXHnsXifcK0DyinTVjQKan_U"));
	}
}
