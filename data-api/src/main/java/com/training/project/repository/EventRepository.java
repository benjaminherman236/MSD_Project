package com.training.project.repository;

import com.training.project.domain.Event;
import org.springframework.data.repository.CrudRepository;
public interface EventRepository extends CrudRepository<Event, Long> {

}
