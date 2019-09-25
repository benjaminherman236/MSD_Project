package com.training.project.api.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.project.domain.Registration;

@RestController
@RequestMapping("/account")
public class RegistrationResource {
	@GetMapping("/registrations")
	public Registration getCustomer() {
		return new Registration("Bob", "bob@bob.com", "password");
	}

}
