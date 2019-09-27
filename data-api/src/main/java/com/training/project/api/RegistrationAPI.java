package com.training.project.api;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.training.project.domain.Registration;
import com.training.project.repository.RegistrationRepository;

@RestController
@RequestMapping("/account")
public class RegistrationAPI {
	
	@Autowired
	RegistrationRepository repo;
	
	@GetMapping("/registrations")
	public Iterable<Registration> getAll() {
		return repo.findAll();
	}
	@GetMapping("/registrations/{registrationId}")
	public Optional<Registration> getRegistrationById(@PathVariable("registrationId") long id) {
		return repo.findById(id);
	}
	@PostMapping("/registrations")
	public ResponseEntity<?> addRegistration(@RequestBody Registration newRegistration, UriComponentsBuilder uri){
		if (newRegistration.getId() != 0 || newRegistration.getEventId() == 0 || newRegistration.getCustomerId() == 0 || newRegistration.getDate() == null || newRegistration.getNotes() == null) {
			return ResponseEntity.badRequest().build();
		}
		newRegistration = repo.save(newRegistration);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newRegistration.getId()).toUri();
		ResponseEntity<?> response = ResponseEntity.created(location).build();
		return response;
	}
	@PutMapping("/registrations/{registrationId}")
	public ResponseEntity<?> putRegistration(@RequestBody Registration newRegistration, @PathVariable("registrationId") long registrationId){
		if (newRegistration.getId() != registrationId || newRegistration.getEventId() == 0 || newRegistration.getCustomerId() == 0 || newRegistration.getDate() == null || newRegistration.getNotes() == null) {
			return ResponseEntity.badRequest().build();
		}
		newRegistration = repo.save(newRegistration);
		return ResponseEntity.ok().build();
	}
	@DeleteMapping("/registrations/{registrationId}")
	public ResponseEntity<?> deleteCustomer(@PathVariable("registrationId") long registrationId) {
		repo.deleteById(registrationId);
		return ResponseEntity.ok().build();
	}
}
