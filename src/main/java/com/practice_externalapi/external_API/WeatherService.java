package com.practice_externalapi.external_API;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class WeatherService {

    private static final String API_URL = "https://api.tomorrow.io/v4/weather/forecast?location=42.3478,-71.0466&apikey=PQc9zuoS4q9P3VBSXEUWQSGlGB0D276p";

    public WeatherResponse getWeatherData() {
        RestTemplate restTemplate = new RestTemplate();
        String jsonResponse = restTemplate.getForObject(API_URL, String.class);

        // DEBUG: Print JSON response in console
        System.out.println("API Response: " + jsonResponse);

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(jsonResponse, WeatherResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
