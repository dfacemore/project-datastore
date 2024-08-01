package com.example.projectdatastore.web.controller;

import com.example.projectdatastore.model.exception.SensorNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(SensorNotFoundException.class)
    public String sensorNotFound(SensorNotFoundException e) {
        return "Sensor not found.";
    }

    @ExceptionHandler
    public String server(Exception e) {
        e.printStackTrace();
        return "Something happened.";
    }

}
