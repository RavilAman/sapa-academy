package badeshov;

import badeshov.hw5.Car;
import badeshov.hw5.EngineBrokenException;
import badeshov.hw5.FuelEmptyException;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

public class BadeshovMain {

    private static final Logger logger = Logger.getLogger(Car.class.getName());

    public static void drive(Car car) throws EngineBrokenException, FuelEmptyException {
        for (int i = car.getFuel(); i >= 1; i = i - 1) {
            logger.info("Car fuel: " + car.getFuel() + " " + car.getName());

            car.setFuel(car.getFuel() - 1);

            if (car.getEngineBroken() == true) throw new EngineBrokenException("Мотор неисправен!" + car.getName());
            if (car.getFuel() == 0) {
                throw new FuelEmptyException("Топливо закончилось!" + car.getName());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            logger.info("Залейте бензин: ");
            int fuelDegree = scanner.nextInt();
            Random rd = new Random();

            Car car = new Car("Volkswagen", fuelDegree, rd.nextBoolean());

            try {
                drive(car);
            } catch (FuelEmptyException e) {
                logger.info("Error message of fuel degree: " + e.getMessage());
            } catch (EngineBrokenException e) {
                logger.info("Error message of engine: " + e.getMessage());
                break;
            }

            logger.info("Хотите заправиться или завершить? (refuel/stop): ");
            String rs = scanner.next();
            if (rs.equals("refuel")) {
                continue;
            } else if (rs.equals("stop")) {
                break;
            } else {
                logger.info("Напиши refuel или stop безошибочно");
            }
            if (rs.equals("refuel")) {
                continue;
            } else if (rs.equals("stop")) {
                break;


            }
        }
    }
}