package org.example.scheduleservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.scheduleservice.dto.TrainingDTO;
import org.example.scheduleservice.mapper.training.TrainingReadMapper;
import org.example.scheduleservice.service.SectionService;
import org.example.scheduleservice.service.TrainingService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/schedule")
public class ScheduleController {

    private final SectionService sectionService;
    private final TrainingService trainingService;
    private final TrainingReadMapper trainingReadMapper;

    @GetMapping("/{userId}")
    public ResponseEntity<List<TrainingDTO>> findAllSections(@PathVariable Long userId) {
        List<TrainingDTO> readDTOS = trainingService.findAll().stream()
                .map(trainingReadMapper::map).toList();
        return ResponseEntity.ok(readDTOS);
    }

    @DeleteMapping("/{trainingId}")
    public ResponseEntity<Void> deleteTraining(@PathVariable Long trainingId) {
        return ResponseEntity.noContent().build();
    }

}