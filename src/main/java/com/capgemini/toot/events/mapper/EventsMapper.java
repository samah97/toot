package com.capgemini.toot.events.mapper;

import com.capgemini.toot.events.dto.request.CreateEventRequest;
import com.capgemini.toot.events.dto.response.CreateEventResponse;
import com.capgemini.toot.events.model.Event;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventsMapper {

    Event createRequestToModel(CreateEventRequest createEventRequest);
    CreateEventResponse eventToCreateResponse(Event event);

}
