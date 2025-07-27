package yernat.hw5;

import java.util.Random;
import java.util.Scanner;

public class exampleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Start to drive");

        while (true) {
            System.out.print("Залейте бензин: ");
            int fuel = scanner.nextInt();

            boolean engineBroken = false;
            Car car = new Car(fuel,"Kia k5", engineBroken);

            try{
                drive(car);
            } catch (FuelEmptyException e) {
                System.out.println(e.getMessage());
                System.out.println("Хотите заправиться или завершить? (refuel/stop): ");
                String choice = scanner.next();

                if(choice.equals("stop")){
                    break;
                }else{
                    continue;
                }
            }catch (EngineBrokenException e){
                System.out.println(e.getMessage());
                System.out.println("Finish to drive");
                break;
            }

        }
    }

    public static void drive(Car car) throws FuelEmptyException {
        while (car.getFuel() >= 0) {
            if (car.isEngineBroken()) {
                throw new EngineBrokenException("❗ Мотор неисправен!");
            }

            System.out.println("Car fuel: " + car.getFuel());

            if (car.getFuel() == 0) {
                throw new FuelEmptyException("❗ Топливо закончилось!");
            }
            car.setFuel(car.getFuel() - 1);
        }
    }
}