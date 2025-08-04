package example.lesson9.hw.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import example.lesson9.hw.model.WeatherResponse;
import ulykbekova.hw.five.Car;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        String apiKey = "";
        String city = "";
        int days = 0;
        WeatherDataService service = new WeatherDataService();

        service.getWeatherData(apiKey, city, days);
    }
}
