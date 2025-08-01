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

//        String apiKey;
//        String city;
//        int days;
        WeatherDataService service = new WeatherDataService();

        // вам нужно передавать в этот метод свой api key, город что ввел пользователь и насколько дней человек хочет узнать погоду, 1 на сегодняшний день, 2 на сегодня и завтра получим данные о погоде, и т.д. макс 14
        service.getWeatherData(apiKey, city, days);
    }
}
