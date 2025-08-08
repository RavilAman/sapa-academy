package badeshov;

import badeshov.hw9.MyThread;
import example.lesson9.hw.model.ForecastDay;
import example.lesson9.hw.model.Hour;
import example.lesson9.hw.model.WeatherResponse;
import example.lesson9.hw.service.WeatherDataService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class BadeshovMain {

    private static final String API_KEY = "efc3592e2e7a43a3b38105635250408";
    private static final Logger logger = Logger.getLogger(BadeshovMain.class.getName());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        logger.info("Enter city name (in english): ");
        String city = scanner.next();

        logger.info("Enter the date (ex. 2025-08-07, max. 14 days): ");
        String date = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate now = LocalDate.now();
        LocalDate inputDate = LocalDate.parse(date, formatter);
        System.out.println(inputDate);

        LocalTime inputTime = null;

        long raznica = ChronoUnit.DAYS.between(now, inputDate);
        System.out.println(raznica);

        logger.info("Do you want to enter time? (yes/no)");
        String otvet = scanner.next();
        if (otvet.equalsIgnoreCase("yes")) {
            logger.info("Enter time: ");
            String time = scanner.next();
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("H:mm");
            inputTime = LocalTime.parse(time, timeFormatter);

            int minutes = inputTime.getMinute();


            if (minutes >= 30)
            {
                inputTime = inputTime.truncatedTo(ChronoUnit.HOURS);
                inputTime = inputTime.plusHours(1);
            }
            else {
                inputTime = inputTime.truncatedTo(ChronoUnit.HOURS);
            }

            System.out.println(inputTime);
        } else {
            String time;
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
            time = "12:00";
            inputTime = LocalTime.parse(time, timeFormatter);
        }


        int days = Math.toIntExact(raznica) + 1;
        WeatherDataService service = new WeatherDataService();
        WeatherResponse response = service.getWeatherData(API_KEY, city, days);

//        Thread t1 = new MyThread("Сетевой запрос..");
//        t1.start();
        List<ForecastDay> forecastDays = response.forecast.forecastday;
        ForecastDay day = getForeCastDay(inputDate, forecastDays);
        Thread newThread = new Thread(String.valueOf(day));
        newThread.start();
        System.out.println("Сетевой запрос");
        System.out.println(day);
        List<Hour> hours = day.hour;
        Hour hour = getHour(inputTime, hours);
        System.out.println(hour);

//        Thread t2 = new MyThread("Запись информации..");
//        t2.start();
        String input = "City: " + city + "\n"
                + "Date: " + inputDate + "\n"
                + "Time: " + inputTime + "\n"
                + "Forecast: " + hour.condition.text + "\n"
                + "Temperature: " + hour.temp_c + "\n"
                + "Wind: " + hour.wind_mph;

        Thread newThread2 = new Thread(input);
        newThread2.start();
        System.out.println("Запись информации");
        writeToFile(input);
    }

    private static ForecastDay getForeCastDay(LocalDate date, List<ForecastDay> forecastDays) {
        for (ForecastDay day : forecastDays) {
            if (day.date.equals((date.toString()))) {
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

    private static void writeToFile(String input) {

        try (
                FileWriter fileWriter = new FileWriter("src/main/java/badeshov/hw8/weather-info.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            bufferedWriter.write(input);
            bufferedWriter.newLine();
            System.out.println("A file has been written successfully!");
        } catch (IOException e) {
            System.err.println("ERRORS FOUND" + e.getMessage());
        }
    }
}