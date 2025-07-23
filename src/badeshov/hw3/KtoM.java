package badeshov.hw3;

import java.io.PrintStream;
import java.util.Scanner;

public class KtoM {
        public void convertKM() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Kilometer: ");
                double k = scanner.nextDouble();
                double m = k * 0.62;
                System.out.println("Mile: " + m);
                PrintStream format = System.out.format("Mile: " + "%.2f", m);
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