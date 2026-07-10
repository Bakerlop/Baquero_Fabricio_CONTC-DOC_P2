package com.estudiante.proyecto.service;

import com.estudiante.proyecto.domain.HealthStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    @Value("${spring.profiles.active}")
    private String activeProfile;

    public HealthStatus getHealthStatus() {

        return new HealthStatus(
                "UP",
                activeProfile,
                "Sistema funcionando correctamente"
        );
    }
}