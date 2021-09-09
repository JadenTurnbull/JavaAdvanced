package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeExercise {

    public static void main(String[] args) {
        LocalDate AmsDate;
        LocalTime AmsTime;
        ZoneId Amsterdam = ZoneId.of("Europe/Amsterdam");

        AmsDate = LocalDate.of(2021, 9, 9);
        AmsTime = LocalTime.of(10,23);

        ZonedDateTime NLD = ZonedDateTime.of(AmsDate, AmsTime, Amsterdam);

        System.out.println(NLD);
    }
}
