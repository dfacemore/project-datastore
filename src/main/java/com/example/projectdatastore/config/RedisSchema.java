package com.example.projectdatastore.config;

import com.example.projectdatastore.model.MeasurementType;

public class RedisSchema {

    //Set
    public static String sensorKeys() {
        return KeyHelper.getKey("sensors");
    }

    //hash  with summary types
    public static String summaryKey(
            long sensorId,
            MeasurementType measurementType
    ) {
        return KeyHelper.getKey("sensors:" + sensorId + ":" + measurementType.name().toLowerCase());
    }

}
