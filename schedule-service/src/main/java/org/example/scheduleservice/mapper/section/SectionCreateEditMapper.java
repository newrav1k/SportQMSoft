package org.example.scheduleservice.mapper.section;

import lombok.RequiredArgsConstructor;
import org.example.scheduleservice.dto.SectionDTO;
import org.example.scheduleservice.entity.Section;
import org.example.scheduleservice.mapper.Mapper;
import org.example.scheduleservice.repository.SectionRepository;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SectionCreateEditMapper implements Mapper<SectionDTO, Section> {

    private final SectionRepository sectionRepository;

    @Override
    public Section map(SectionDTO from) {
        return Section.builder()
                .title(from.getTitle())
                .trainings(from.getTrainings())
                .build();
    }

    @Override
    public Section map(SectionDTO from, Section to) {
        return Section.builder()
                .title(from.getTitle())
                .trainings(from.getTrainings())
                .build();
    }

}