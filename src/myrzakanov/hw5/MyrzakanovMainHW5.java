package myrzakanov.hw5;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

public class MyrzakanovMainHW5 {
    private static Logger logger = Logger.getLogger(MyrzakanovMainHW5.class.getName());

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        logger.info("Start to drive ");

        while(true) {
            logger.info("skol'ko litrov hotite zalit': ");
            int fuel = scanner.nextInt();

            boolean engineBroken = random.nextBoolean();
            Car car = new Car("Subaru Legacy", fuel, engineBroken);

            try{
                drive(car);
            }catch(FuelEmptyException b){
                logger.info(b.getMessage());
                logger.info("hotite zapravitsiya : yes or no");
                String choise = scanner.next();

                if(choise.equals("no")){
                    logger.info("Stop");
                    break;
                }
            }
            catch (EngineBrokenException e){
                logger.info(e.getMessage());
                logger.info("finish to drive");
                break;
            }
        }
    }
        private static void drive (Car car)  throws FuelEmptyException{
            while (car.getFuel() >= 0){
                if(car.isEngineBroken()){
                    throw new EngineBrokenException("Motor mashiny "+car.getName()+" ne ispraven");
                }
                logger.info("Car Fuel"+car.getFuel());
                if(car.getFuel() == 0){
                    throw new FuelEmptyException("Zakonchilsiya topliva");
                }
                car.setFuel(car.getFuel()-1);
            }
        }
    }

