package com.training.project.repository;

import com.training.project.domain.Customer;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
public Optional<Customer> findByNameAndPassword(String name, String password);
}
