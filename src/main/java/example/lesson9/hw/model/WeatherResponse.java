package example.lesson9.hw.model;

import lombok.ToString;

@ToString
public class WeatherResponse {
    public Location location;
    public Current current;
    public Forecast forecast;
}
