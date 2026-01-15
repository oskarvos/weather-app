package com.oskarvos.weatherapp.model;

import java.time.LocalDateTime;

public class Weather {

    private Long id;
    private String city;
    private Double temperature;
    private LocalDateTime recorderDateTime;

    public Weather() {}

    public Weather(String city, Double temperature, LocalDateTime recorderDateTime) {
        this.city = city;
        this.temperature = temperature;
        this.recorderDateTime = recorderDateTime;
    }

    public String getCity() {
        return city;
    }

    public Double getTemperature() {
        return temperature;
    }

    public LocalDateTime getRecorderDateTime() {
        return recorderDateTime;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public void setRecorderDateTime(LocalDateTime recorderDateTime) {
        this.recorderDateTime = recorderDateTime;
    }
}
