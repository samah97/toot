package com.capgemini.toot.events.service;

import com.capgemini.toot.events.dto.request.CreateEventRequest;
import com.capgemini.toot.events.model.Event;

public interface EventsService {

    Event create(Event event);
}
