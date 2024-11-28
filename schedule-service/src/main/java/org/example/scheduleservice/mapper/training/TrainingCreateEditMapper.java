package org.example.scheduleservice.mapper.training;

import lombok.RequiredArgsConstructor;
import org.example.scheduleservice.dto.TrainingDTO;
import org.example.scheduleservice.entity.Training;
import org.example.scheduleservice.mapper.Mapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TrainingCreateEditMapper implements Mapper<TrainingDTO, Training> {

    @Override
    public Training map(TrainingDTO from) {
        return Training.builder()
                .startDate(from.getStartDate())
                .startTime(from.getStartTime())
                .availableSeats(from.getAvailableSeats())
                .userId(from.getUserId())
                .build();
    }

    @Override
    public Training map(TrainingDTO from, Training to) {
        return Training.builder()
                .startDate(from.getStartDate())
                .startTime(from.getStartTime())
                .availableSeats(from.getAvailableSeats())
                .userId(from.getUserId())
                .build();
    }

}