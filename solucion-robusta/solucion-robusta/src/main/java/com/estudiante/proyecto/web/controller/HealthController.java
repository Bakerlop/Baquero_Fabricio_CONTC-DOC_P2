package com.estudiante.proyecto.web.controller;

import com.estudiante.proyecto.domain.HealthStatus;
import com.estudiante.proyecto.service.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping("/health")
    public HealthStatus health() {
        return healthService.getHealthStatus();
    }
}