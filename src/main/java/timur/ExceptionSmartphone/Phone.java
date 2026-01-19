package timur.ExceptionSmartphone;

import java.util.Random;
import java.util.Scanner;

public class Phone {
    public static void usePhone(Smartphone smartphone) throws BatteryEmptyException {
        while (smartphone.getBattery() > 0) {
            smartphone.setBattery(smartphone.getBattery() - 10);
            System.out.println("Phone battery" + smartphone.getBattery());

            if (smartphone.getOverheated()) {
                throw new OverheatingException("Телефон перегрелся!");

            }
        }
        throw new BatteryEmptyException("Батарея разряжена!");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Включаем телефон...");

        boolean bat = true;
        Smartphone smartphone = null;

        while (bat) {
            try {
                if (smartphone == null) {
                    System.out.print("Зарядите телефон(0-100): ");
                    int battery = scanner.nextInt();
                    scanner.nextLine();


                    if (battery < 0 || battery > 100) {
                        System.out.println("Неверное значение! Устанавливаю 50%.");
                        battery = 50;
                    }
                    boolean overheated = random.nextBoolean();
                    smartphone = new Smartphone(battery, overheated);

                }

                usePhone(smartphone);
            } catch (BatteryEmptyException e) {
                System.out.print(e.getMessage());
                System.out.print("Хотите зарядить телефон ? (да/нет): ");
                String choice = scanner.nextLine().trim().toLowerCase();
                if (choice.equals("Да")) {
                    System.out.print("Зарядите телефон: ");
                    int battery = scanner.nextInt();
                    scanner.nextLine();

                    if (battery < 0 || battery > 100) {
                        System.out.println("Неверное значение! Устанавливаю 50%.");
                        battery = 50;
                        smartphone.setBattery(battery);
                        smartphone.setOverheated(random.nextBoolean());
                    }
                } else {
                    bat = false;
                }
            } catch (OverheatingException e) {
                System.out.print(e.getMessage());
                bat = false;
            }
        }
        System.out.println("Телефон выключен");
    }
}