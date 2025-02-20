package com.practice_externalapi.external_API;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

    @JsonProperty("timelines")
    private Map<String, List<Timeline>> timelines;

    public Map<String, List<Timeline>> getTimelines() {
        return timelines;
    }

    public void setTimelines(Map<String, List<Timeline>> timelines) {
        this.timelines = timelines;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Timeline {
        @JsonProperty("time")
        private String time;

        @JsonProperty("values")
        private Values values;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Values getValues() {
            return values;
        }

        public void setValues(Values values) {
            this.values = values;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true) // 🔥 Add This Line
    public static class Values {
        @JsonProperty("temperature")
        private double temperature;

        @JsonProperty("humidity")
        private double humidity;

        @JsonProperty("windSpeed")
        private double windSpeed;

        @JsonProperty("precipitationProbability")
        private double precipitationProbability;

        @JsonProperty("cloudCover")
        private double cloudCover;

        @JsonProperty("dewPoint")
        private double dewPoint;

        @JsonProperty("windDirection")
        private double windDirection;

        @JsonProperty("weatherCode")
        private int weatherCode;

        @JsonProperty("visibility")
        private double visibility;

        @JsonProperty("uvIndex")
        private int uvIndex;

        // Getters and Setters
        public double getTemperature() { return temperature; }
        public void setTemperature(double temperature) { this.temperature = temperature; }

        public double getHumidity() { return humidity; }
        public void setHumidity(double humidity) { this.humidity = humidity; }

        public double getWindSpeed() { return windSpeed; }
        public void setWindSpeed(double windSpeed) { this.windSpeed = windSpeed; }

        public double getPrecipitationProbability() { return precipitationProbability; }
        public void setPrecipitationProbability(double precipitationProbability) { this.precipitationProbability = precipitationProbability; }

        public double getCloudCover() { return cloudCover; }
        public void setCloudCover(double cloudCover) { this.cloudCover = cloudCover; }

        public double getDewPoint() { return dewPoint; }
        public void setDewPoint(double dewPoint) { this.dewPoint = dewPoint; }

        public double getWindDirection() { return windDirection; }
        public void setWindDirection(double windDirection) { this.windDirection = windDirection; }

        public int getWeatherCode() { return weatherCode; }
        public void setWeatherCode(int weatherCode) { this.weatherCode = weatherCode; }

        public double getVisibility() { return visibility; }
        public void setVisibility(double visibility) { this.visibility = visibility; }

        public int getUvIndex() { return uvIndex; }
        public void setUvIndex(int uvIndex) { this.uvIndex = uvIndex; }
    }
}
