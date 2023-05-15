package com.jekajops.fastcasinobot.controller;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class GameController {

    @GetMapping("/actuator/health")
    public ResponseEntity<?> actuatorHealth() {
        return ResponseEntity.ok().body("UP");
    }

    public ResponseEntity<?> startGame(RequestEntity<?> requestEntity) {
        return null;
    }


}
