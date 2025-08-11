package ulykbekova;

import example.lesson9.hw.model.Forecast;
import example.lesson9.hw.model.ForecastDay;
import example.lesson9.hw.model.Hour;
import example.lesson9.hw.model.WeatherResponse;
import example.lesson9.hw.service.WeatherDataService;
import ulykbekova.hw.five.Car;
import ulykbekova.hw.five.EngineBrokenException;
import ulykbekova.hw.five.FuelEmptyException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate now = LocalDate.now();
        LocalDate inputDate = LocalDate.parse(date, formatter);
        long days = ChronoUnit.DAYS.between(now, inputDate) + 1;
        WeatherDataService service = new WeatherDataService();
        WeatherResponse response = service.getWeatherData(API_KEY, city, days);


        List<ForecastDay> forecastday = response.forecast.forecastday;
        ForecastDay day = getForecastDay(inputDate, forecastday);
        List<Hour> hours = day.hour;
        LocalTime inputTime;
        logger.info("Хотите ввести время (да/нет)");
        String otvet = scanner.next();
        if (otvet.equalsIgnoreCase("да")) {
            logger.info("Введите время: чч:мм");
            String time = scanner.next();
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

           inputTime = LocalTime.parse(time, timeFormatter);

            int minut = inputTime.getMinute();


            if (minut >= 30) {
                inputTime = inputTime.truncatedTo(ChronoUnit.HOURS);
                inputTime = inputTime.plusHours(1);
            } else {
                inputTime = inputTime.truncatedTo(ChronoUnit.HOURS);
            }

          } else {
            inputTime = LocalTime.parse("12:00");
        }
        Hour hour = getHour(inputTime, hours);



        Map<String, String> pogoda = new HashMap<>();
        pogoda.put("Sunny", "Солнечно");
        pogoda.put("Clear", "ясно");
        pogoda.put("Patchy rain nearby", "Небольшой дождь рядом");
        String text = "Город: " + city + "\n" +
              "Время: " + hour.time+ "\n"
               + "Состояние погоды: " + hour.condition.text + "\n"
               + "температуру: " + hour.temp_c + "C" + "\n"
               + "скорость ветра "+hour.wind_kph + "км/ч";
        writleFile(text);

    }

    private static ForecastDay getForecastDay(LocalDate date, List<ForecastDay> forecastday) {
        for (ForecastDay day : forecastday) {
            if (day.date.equals(date.toString())) {
                return day;
            }
        }
        return null;
    }
    private static Hour getHour(LocalTime time, List<Hour> hours) {
        for (Hour h : hours) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime localDateTime = LocalDateTime.parse(h.time, formatter);

            if (localDateTime.toLocalTime().equals(time)) {
                return h;
            }
        }
        return null;
    }
    private static void writleFile(String text){
        try (
            FileWriter fileWriter = new FileWriter("src/main/java/ulykbekova/hw/eigth/hw8.txt");
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        ){
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            logger.info("Строка записана в файл");
        }catch (IOException e) {
            logger.info("Ошибка при записи в файл "+e.getMessage());
        }
    }
}
