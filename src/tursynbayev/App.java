package tursynbayev;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose the type of convertion:");
            System.out.println("1. Celsius -- Fahrenheit");
            System.out.println("2. Kilometers -- Miles");
            System.out.println("3. Kilograms -- Pounds");
            System.out.println("Enter a number (1-3): ");
            String choice = scanner.nextLine();
            BaseConverter converter ;
            String uniter = "";
            switch (choice) {
                case "1":
                    converter = new CelsiusToFahrenheitConverter();
                    uniter = "°F";
                    break;
                case "2":
                    converter = new KilometersToMilesConverter();
                    uniter = "Mills";
                    break;
                case "3":
                    converter = new KilogramsToPoundsConverter();
                    uniter = "pound";
                    break;
                default:
                    System.out.println("Error: Please choose number from lhe list (1-3).");
                    continue;
            }
            double value = converter.readvalue();
            if (Double.isNaN(value)) {
                continue;
            }
            double result = converter.convert(value);
            converter.printResult(result, uniter);
            System.out.print("Do you want to continue? (yes/no): ");
            String answer = scanner.nextLine().toLowerCase();
            if (!answer.equals("yes")) {
                System.out.println("you left from the program");
                break;
            }
        }

    }
}
