package com.capgemini.toot.events.model;

import com.capgemini.toot.base.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Event extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;
    Integer hostId;
    LocalDateTime dateTime;
    String location;

}
