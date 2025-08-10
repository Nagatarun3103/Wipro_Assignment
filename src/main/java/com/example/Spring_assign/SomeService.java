package com.example.Spring_assign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;


@Service
public class SomeService {

    private final DataFileConfig config;

    @Autowired
    public SomeService(DataFileConfig config) {
        this.config = config;
    }

    @PostConstruct
    public void printConfig() {
        System.out.println("URL: " + config.getUrl());
        System.out.println("Username: " + config.getUsername());
        System.out.println("Password: " + config.getPassword());
    }
}
