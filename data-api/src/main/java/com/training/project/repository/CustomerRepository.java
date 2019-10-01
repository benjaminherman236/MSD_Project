package com.training.project.repository;

import com.training.project.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	public Optional<Customer> findByName(String name);
	
}
