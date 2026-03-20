package com.example.transactionservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "Transaction Service Running";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}