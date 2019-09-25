package com.training.project.repository;
import org.springframework.data.repository.CrudRepository;

import com.training.project.domain.Registration;
public interface RegistrationRepository extends CrudRepository <Registration, Long> {
	
}
