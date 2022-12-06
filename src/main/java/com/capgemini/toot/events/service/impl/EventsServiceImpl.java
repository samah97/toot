package com.capgemini.toot.events.service.impl;

import com.capgemini.toot.events.model.Event;
import com.capgemini.toot.events.repository.EventsRepository;
import com.capgemini.toot.events.service.EventsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EventsServiceImpl implements EventsService {

    final EventsRepository repository;

    @Override
    public Event create(Event event) {
        return repository.save(event);
    }
}
