package com.example.projectdatastore.web.mapper;

import com.example.projectdatastore.model.Summary;
import com.example.projectdatastore.web.dto.SummaryDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SummaryMapper extends Mappable<Summary, SummaryDto> {
}
