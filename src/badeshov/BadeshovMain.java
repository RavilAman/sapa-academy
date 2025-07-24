package badeshov;

import badeshov.hw3.AbstractConvert;
import badeshov.hw3.CtoF;
import badeshov.hw3.KtoM;
import badeshov.hw3.KtoP;

import java.util.Scanner;

public class BadeshovMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите единицу конвертации: Celsius - C; Kilometer - km; Kilogram - kg");
            String v = scanner.next();
            switch (v) {
                case "C": {
                    AbstractConvert convert = new CtoF();
                    convert.convertation();
                    break;
                }
                case "km": {
                    AbstractConvert convert = new KtoM();
                    convert.convertation();
                    break;
                }
                case "kg": {
                    AbstractConvert convert = new KtoP();
                    convert.convertation();
                    break;
                }
                default:
                    System.out.println("Правильные запросы: или C, или km, или kg");
                    break;
            }

            System.out.println("Если хотите продолжить, нажмите на 1");
            String r = scanner.next();
            if(!r.equals("1")) {
                System.out.println("Рад помочь!");
                break;
            }
        }
    }
}
