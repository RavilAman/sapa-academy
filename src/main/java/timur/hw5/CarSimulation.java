import timur.hw5.Car;
import timur.hw5.EngineBrokenException;
import timur.hw5.FuelEmptyException;

import java.util.Random;
import java.util.Scanner;

public class CarSimulation {
    public static void drive(Car car) throws FuelEmptyException {
        while (car.getFuel() > 0) {
            car.setFuel(car.getFuel() - 1);
            System.out.println("Car fuel: " + car.getFuel());

            if (car.getEngineBroken()) {
                throw new EngineBrokenException("Мотор не исправен");
            }
        }
        throw new FuelEmptyException("Топливо закончилось");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Start to drive!");
        boolean continueProgram = true;
        Car car = null;
        while (continueProgram) {
            try {
                if (car == null) {
                    System.out.print("Залейте бензин: ");
                    int fuel = scanner.nextInt();
                    scanner.nextLine();
                    boolean engineBroken = random.nextBoolean();

                    car = new Car(fuel, engineBroken);
                }

                drive(car);
            } catch (FuelEmptyException e) {
                System.out.println(e.getMessage());
                System.out.print("Хотите заправиться или завершить ? (refuel/stop): ");
                String choice = scanner.nextLine().trim().toLowerCase();
                if (choice.equals("refuel")) {
                    System.out.print("Залейте бензин: ");
                    int fuel = scanner.nextInt();
                    scanner.nextLine();
                    car.setFuel(fuel);
                    car.setEngineBroken(random.nextBoolean());
                } else {
                    continueProgram = false;
                }
            } catch (EngineBrokenException e) {
                System.out.println(e.getMessage());
                continueProgram = false;
            }
        }
        System.out.println("Finish to drive");
    }
}