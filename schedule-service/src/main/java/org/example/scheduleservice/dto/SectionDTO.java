package org.example.scheduleservice.dto;

import lombok.Value;
import org.example.scheduleservice.entity.Training;

import java.util.List;

@Value
public class SectionDTO {
    String title;
    List<Training> trainings;
}