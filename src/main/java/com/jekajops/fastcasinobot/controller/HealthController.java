package com.jekajops.fastcasinobot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping
    public ResponseEntity<?> actuatorHealth() {
        return ResponseEntity.ok().body("UP");
    }
}
