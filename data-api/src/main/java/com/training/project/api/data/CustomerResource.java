package com.training.project.api.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.project.domain.Customer;

@RestController
@RequestMapping("/account")
public class CustomerResource {
	@GetMapping("/customers")
	public Customer getCustomer() {
		return new Customer("Bob", "bob@bob.com", "password");
	}

}
