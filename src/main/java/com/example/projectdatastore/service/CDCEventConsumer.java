package com.example.projectdatastore.service;

public interface CDCEventConsumer {

    void handle(String message);

}
