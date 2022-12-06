package com.capgemini.toot.base.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDateTime;

@MappedSuperclass
public class BaseModel {

        @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    LocalDateTime createdAt;
            @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    LocalDateTime updatedAt;

}
