package main.java.yernat;

import yernat.hw5.Car;
import yernat.hw5.EngineBrokenException;
import yernat.hw5.FuelEmptyException;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

public class TurarbekovMain {

    private static Logger logger = Logger.getLogger(TurarbekovMain.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        logger.info("Start  to drive");

        while (true) {
           logger.info("Залейте бензин: ");
            int fuel = scanner.nextInt();

            boolean engineBroken = random.nextBoolean();
            Car car = new Car(fuel,"Kia k5", engineBroken);

            try{
                drive(car);
            } catch (FuelEmptyException e) {
                logger.info(e.getMessage());
                logger.info("Хотите заправиться или завершить? (refuel/stop): ");
                String choice = scanner.next();

                if(choice.equals("stop")){
                    logger.info("Finish to drive");
                    break;
                }else{
                    logger.info("Finish to drive");
                    continue;
                }
            }catch (EngineBrokenException e){
                logger.info(e.getMessage());
                logger.info("Finish to drive");
                break;
            }

        }
    }

    public static void drive(Car car) throws FuelEmptyException {

        while (car.getFuel() >= 0) {
            if (car.isEngineBroken()) {
                throw new EngineBrokenException("❗У моей машины " + car.getName() + " мотор неисправен!");
            }

            logger.info("Car fuel: " + car.getFuel());

            if (car.getFuel() == 0) {
                throw new FuelEmptyException("❗У моей машины " + car.getName() + " топливо закончилось!");
            }
            car.setFuel(car.getFuel() - 1);
        }
    }
}