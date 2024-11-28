package org.example.scheduleservice.dto;

import lombok.Value;

import java.time.LocalDate;
import java.time.LocalTime;

@Value
public class TrainingDTO {
    String title;
    LocalDate startDate;
    LocalTime startTime;
    Integer availableSeats;
    Long userId;
}