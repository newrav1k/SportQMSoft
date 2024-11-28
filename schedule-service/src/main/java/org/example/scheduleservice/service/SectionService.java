package org.example.scheduleservice.service;

import lombok.RequiredArgsConstructor;
import org.example.scheduleservice.repository.SectionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class SectionService {

    private final SectionRepository sectionRepository;

}