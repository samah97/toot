package com.capgemini.toot.events.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CreateEventResponse {

    Long id;
    String name;
    Integer hostId;
    LocalDateTime dateTime;
    String location;


}
