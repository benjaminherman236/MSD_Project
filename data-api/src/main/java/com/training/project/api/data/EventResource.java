package com.training.project.api.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.project.domain.Event;

@RestController
@RequestMapping("/account")
public class EventResource {
	@GetMapping("/events")
	public Event getCustomer() {
		return new Event("Bob", "bob@bob.com", "password");
	}

}
