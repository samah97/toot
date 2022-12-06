package com.capgemini.toot.events.controller;

import com.capgemini.toot.base.controller.BaseController;
import com.capgemini.toot.events.dto.request.CreateEventRequest;
import com.capgemini.toot.events.dto.response.CreateEventResponse;
import com.capgemini.toot.events.mapper.EventsMapper;
import com.capgemini.toot.events.model.Event;
import com.capgemini.toot.events.service.EventsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/events")
public class EventController extends BaseController {

    final EventsService eventsService;
    final EventsMapper mapper;


    @PostMapping
    public ResponseEntity<CreateEventResponse> create(@RequestBody CreateEventRequest request){
        Event event = eventsService.create(
                mapper.createRequestToModel(request)
        );
        CreateEventResponse response = mapper.eventToCreateResponse(event);
        return ResponseEntity.ok().body(
                response
        );
    }


}
