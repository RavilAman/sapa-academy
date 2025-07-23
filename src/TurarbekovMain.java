import yernat.hw3.AbstractConvert;
import yernat.hw3.CeltoFa;
import yernat.hw3.KgtoFn;
import yernat.hw3.KmtoMile;

import java.util.Scanner;

public class TurarbekovMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose a type of conversion:");
            System.out.println(" - celsiusToFahrenheit");
            System.out.println(" - kilometerToMile");
            System.out.println("- kilogramToPound");
            System.out.print("Vvod: ");

            String choice = scanner.nextLine();
            AbstractConvert converter = null;

            if (choice.equals("celsiusToFahrenheit")) {
                converter = new CeltoFa();
            } else if (choice.equals("kilometerToMile")) {
                converter = new KmtoMile();
            } else if (choice.equals("kilogramToPound")) {
                converter = new KgtoFn();
            } else {
                System.out.println("Error, wrong type of conversion, bro.");
                continue;
            }

            converter.execute();

            System.out.print("Do u wanna continue? (yes/no): ");
            String again = scanner.nextLine().toLowerCase();

            if (!again.equals("yes")) {
                System.out.println("Bye-bye baby!");
                break;
            }
        }
    }
}