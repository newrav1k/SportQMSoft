package org.example.scheduleservice.mapper.section;

import org.example.scheduleservice.dto.SectionDTO;
import org.example.scheduleservice.entity.Section;
import org.example.scheduleservice.mapper.Mapper;
import org.springframework.stereotype.Component;

@Component
public class SectionReadMapper implements Mapper<Section, SectionDTO> {

    @Override
    public SectionDTO map(Section from) {
        return new SectionDTO(from.getTitle(), from.getTrainings());
    }

}