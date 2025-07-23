package badeshov.hw3;

import java.io.PrintStream;
import java.util.Scanner;

public class KtoP {
    public void convertKP() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Kilogram: ");
            double k = scanner.nextDouble();
            double p = k * 2.20;
            System.out.println("Pound: " + p);
            PrintStream format = System.out.format("Pound: " + "%.2f", p);
            System.out.println();
            System.out.println("Если хотите продолжить, нажмите на 1");

            String r = scanner.next();
            if (r.equals("1")) {
                continue;
            }
            else {
                System.out.println("Рад помочь!");
                break;
            }
        }
    }
}