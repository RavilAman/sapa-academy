package badeshov;

import example.lesson9.hw.model.WeatherResponse;
import example.lesson9.hw.service.WeatherDataService;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BadeshovMain {

    public static void main(String[] args) {

        List<WeatherDataService> weatherDataServiceList = new ArrayList<>();

//        String apiKey; efc3592e2e7a43a3b38105635250408
//        String city; на английском
//        int days; 'год-месяц-день час:минута', например: 2025-08-01 22:00
        WeatherDataService service = new WeatherDataService();
        service.apiKey = efc3592e2e7a43a3b38105635250408;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название города на английском языке: ");
        String city = scanner.nextLine();
        System.out.println("Насколько дней хотите узнать прогноз погоды? (максимально до 14 дней) ");

        // вам нужно передавать в этот метод свой api key,
        // город что ввел пользователь и
        // насколько дней человек хочет узнать погоду,
        // 1 на сегодняшний день, 2 на сегодня и завтра получим данные о погоде, и т.д. макс 14
//        service.getWeatherData(apiKey, city, days);
    }
}