package com.example.projectdatastore.service;

import com.example.projectdatastore.model.MeasurementType;
import com.example.projectdatastore.model.Summary;
import com.example.projectdatastore.model.SummaryType;

import java.util.Set;

public interface SummaryService {

    Summary get(
            long sensorId,
            Set<MeasurementType> measurementTypes,
            Set<SummaryType> summaryTypes
    );

}
