package com.capgemini.toot.helper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateUtils {

    public static Long toLong(LocalDateTime date){
        return ZonedDateTime.of(date, ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

}
