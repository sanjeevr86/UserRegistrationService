package com.user.registration.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = {"com.user.registration"})
public class UserRegistrationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationServiceApplication.class, args);
	}
}
