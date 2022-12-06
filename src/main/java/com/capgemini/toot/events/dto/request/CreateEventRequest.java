package com.capgemini.toot.events.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class CreateEventRequest {

    String name;
    String description;
    LocalDateTime datetime;
    String location;


}
