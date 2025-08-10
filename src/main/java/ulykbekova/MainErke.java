package ulykbekova;

import example.lesson9.hw.model.Forecast;
import example.lesson9.hw.model.ForecastDay;
import example.lesson9.hw.model.WeatherResponse;
import example.lesson9.hw.service.WeatherDataService;
import ulykbekova.hw.five.Car;
import ulykbekova.hw.five.EngineBrokenException;
import ulykbekova.hw.five.FuelEmptyException;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

import static ulykbekova.hw.five.Car.drive;

public class MainErke {
    private static final String API_KEY = "4fd659490dea4195b75155859250408";
    private static Logger logger = Logger.getLogger(MainErke.class.getName());

    public static void main(String[] arsg) {

        Scanner scanner = new Scanner(System.in);
        logger.info("Введите город");

        String city = scanner.next();
        logger.info("Введите дату: формат ввода: гггг-мм-дд");

        String date = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd&HH:mm");
        LocalDate now = LocalDate.now();
        LocalDate inputDate = LocalDate.parse(date, formatter);
        long days = ChronoUnit.DAYS.between(now, inputDate) + 1;
        System.out.println(days);
        WeatherDataService service = new WeatherDataService();
        WeatherResponse response = service.getWeatherData(API_KEY, city, days);


        List<ForecastDay> forecastday = response.forecast.forecastday;
        ForecastDay day = getForecastDay(inputDate.atStartOfDay().toLocalDate(), forecastday);


    }

    private static ForecastDay getForecastDay(LocalDate date, List<ForecastDay> forecastday) {
        for (ForecastDay day : forecastday) {
            if (day.date.equals((date.toString()))) {
                return day;
            }
        }
        return null;
    }
}
