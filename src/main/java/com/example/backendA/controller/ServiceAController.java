package com.example.backendA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/hello")
public class ServiceAController {
    @GetMapping
    public Map<String, Object> hello(@RequestHeader Map<String,String> headers) {
        return Map.of("service","A","headersSeen", headers);
    }
}