package com.estudiante.proyecto.domain;

public class HealthStatus {

    private String status;
    private String profile;
    private String message;

    public HealthStatus(String status, String profile, String message) {
        this.status = status;
        this.profile = profile;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getProfile() {
        return profile;
    }

    public String getMessage() {
        return message;
    }
}