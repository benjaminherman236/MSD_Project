package com.training.project.repository;

import com.training.project.domain.Customer;
import org.springframework.data.repository.CrudRepository;
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
