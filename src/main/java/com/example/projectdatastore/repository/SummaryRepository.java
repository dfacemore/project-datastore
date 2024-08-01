package com.example.projectdatastore.repository;

import com.example.projectdatastore.model.Data;
import com.example.projectdatastore.model.MeasurementType;
import com.example.projectdatastore.model.Summary;
import com.example.projectdatastore.model.SummaryType;

import java.util.Optional;
import java.util.Set;

public interface SummaryRepository {

    Optional<Summary> findBySensorId(
            long sensorId,
            Set<MeasurementType> measurementTypes,
            Set<SummaryType> summaryTypes
    );

    void handle(
            Data data
    );

}
