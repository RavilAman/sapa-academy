package badeshov.hw3;

import java.io.PrintStream;
import java.util.Scanner;

public class CtoF extends AbstractConvert {
    @Override
    public void convertation() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Celsius: ");
            double c = scanner.nextDouble();
            double t = c * 9 / 5;
            double f = t + 32;
            super.printConvertation(f);
            System.out.println("Fahrenheit: " + f);
            PrintStream format = System.out.format("Fahrenheit: " + "%.2f", f);
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

    @Override
    String getValue() { return "Celsius to Fahrenheit"; }
}