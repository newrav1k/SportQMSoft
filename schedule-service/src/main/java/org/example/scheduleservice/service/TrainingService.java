package org.example.scheduleservice.service;

import lombok.RequiredArgsConstructor;
import org.example.scheduleservice.entity.Training;
import org.example.scheduleservice.repository.TrainingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TrainingService {

    private final TrainingRepository trainingRepository;

    public List<Training> findAll() {
        return trainingRepository.findAll();
    }

    @Transactional
    public void deleteById(Long id) {
        trainingRepository.deleteById(id);
    }

}