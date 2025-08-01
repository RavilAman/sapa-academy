package example.lesson9.hw.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import example.lesson9.hw.NoSuchCityException;
import example.lesson9.hw.model.WeatherResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Ничего в данном классе не редактируем!!
 */
public class WeatherDataService {

    private static Logger logger = Logger.getLogger(WeatherDataService.class.getName());

    public WeatherResponse getWeatherData(String apiKey, String city, int days) {
        ObjectMapper mapper = new ObjectMapper();
        WeatherResponse weather = null;
        try {
            String url = "https://api.weatherapi.com/v1/forecast.json?key=" + apiKey + "&q=" + city + "&days=" + days + "&aqi=no&alerts=no";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                // тут ответ от внешнего сервиса парсится и записывается в наш Java объект, теперь весь ответ лежит в нем
                // все данные которые требуются по задаче вы найдете в тут, вам нужно будет пробежаться по ответу, чтобы найти их.
                weather = mapper.readValue(response.body(), WeatherResponse.class);
                logger.info("Got weather response: \n" + mapper.writeValueAsString(weather)); // сам ответ увидите здесь -
                // код выведет все в консоль, и в ней уже можно поискать нужные поля
                // можете искать тут или в классах, которые лежат в model
                // например, данные о времени которые требуются в последнем подпункте пункта 2.4 (когда юзер ввел время)
                // лежат внутри класса Hour, поле time, в виде строки, которую вам надо будет превратить в LocalDateTime для более удобной работы, сравнения и т.д.
            } else if (response.statusCode() == 400 && response.body().contains("No matching location found.")) {
                throw new NoSuchCityException("Такого города не существует, пожалуйста перепроверьте и введите название заново");
                // вам нужно перехватывать данную ошибку, и выводить пользователю ее сообщение, и просить ввести город заново
            }
        } catch (IOException | InterruptedException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }
        return weather;
    }
}
