package ulykbekova;

import ulykbekova.hw.five.Car;
import ulykbekova.hw.five.EngineBrokenException;
import ulykbekova.hw.five.FuelEmptyException;


import java.lang.module.FindException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

import static ulykbekova.hw.five.Car.drive;


public class MainErke {
    private static  Logger logger=Logger.getLogger(MainErke.class.getName());
    public static void main(String[] arsg) {
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        Random random = new Random();
        logger.info("Start to drive");
        logger.info("Введите мару машины:");
        String name=scanner1.nextLine();
        while (true){
            logger.info("Залейте бензин:");
            int fuel=scanner.nextInt();

            boolean engineBroken= random.nextBoolean();
            Car car = new Car(fuel, engineBroken, name);
            try {
                drive(car);
            } catch (FuelEmptyException e){
                logger.info(e.getMessage());
                    logger.info("Хотите заправиться или завершить? refuel/stop ");
                    String otvet = scanner.next();
                    if (otvet.equals("refuel")) {
                        continue;

                    } else if (otvet.equals("stop")) {
                        logger.info("Finish");
                        break;


                    } else {
                        logger.info("ответ не верный");
                        break;
                    }

            }catch (EngineBrokenException e){
                logger.info(e.getMessage());
                break;
            }

//            while (true ){
//                System.out.println("Prodolzhaem?");
//                String otvet = scanner.next();
//                if (otvet.equals("da")) {
//                    break;
//                } else if (otvet.equals("net")) {
//                    System.out.println("Finish");
//                    continue;
//                } else {
//                    System.out.println("ответ не верный");
//                    continue;
//                }
//            }



        }





    }
}