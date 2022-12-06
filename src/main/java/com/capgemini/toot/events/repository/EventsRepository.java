package com.capgemini.toot.events.repository;

import com.capgemini.toot.events.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepository extends JpaRepository<Event, Long> {

}
