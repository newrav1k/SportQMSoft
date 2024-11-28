package org.example.scheduleservice.mapper.training;

import org.example.scheduleservice.dto.TrainingDTO;
import org.example.scheduleservice.entity.Training;
import org.example.scheduleservice.mapper.Mapper;
import org.springframework.stereotype.Component;

@Component
public class TrainingReadMapper implements Mapper<Training, TrainingDTO> {

    @Override
    public TrainingDTO map(Training from) {
        return new TrainingDTO(
                from.getTitle(),
                from.getStartDate(),
                from.getStartTime(),
                from.getAvailableSeats(),
                from.getUserId()
        );
    }

}