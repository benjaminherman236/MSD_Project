package com.training.project.api.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class RegistrationResource {
	@GetMapping("/registrations")
	public RegistrationResponse getCustomer() {
		return new RegistrationResponse("Bob", "bob@bob.com", "password");
	}

}
