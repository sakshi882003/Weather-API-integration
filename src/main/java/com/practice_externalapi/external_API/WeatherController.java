package com.practice_externalapi.external_API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather") // getting weather api here
    public WeatherResponse getWeather() {
        return weatherService.getWeatherData();
    }
}
