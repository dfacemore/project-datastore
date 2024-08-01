package com.example.projectdatastore.service;

import com.example.projectdatastore.model.MeasurementType;
import com.example.projectdatastore.model.Summary;
import com.example.projectdatastore.model.SummaryType;
import com.example.projectdatastore.model.exception.SensorNotFoundException;
import com.example.projectdatastore.repository.SummaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class SummaryServiceImpl implements SummaryService {

    private final SummaryRepository summaryRepository;

    @Override
    public Summary get(
            long sensorId,
            Set<MeasurementType> measurementTypes,
            Set<SummaryType> summaryTypes
    ) {
        return summaryRepository.findBySensorId(
                        sensorId,
                        measurementTypes == null ? Set.of(MeasurementType.values()) : measurementTypes,
                        summaryTypes == null ? Set.of(SummaryType.values()) : summaryTypes
                )
                .orElseThrow(SensorNotFoundException::new);
    }

}
