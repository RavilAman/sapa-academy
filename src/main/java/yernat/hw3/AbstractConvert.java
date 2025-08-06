package main.java.yernat.yernat.hw3;

import java.util.Scanner;

public abstract class AbstractConvert implements Convert{
    Scanner scanner = new Scanner(System.in);

    abstract String getConvertName();

    public void execute() {
        double value;

        while (true) {
            System.out.print("Give me smth to convert: ");
            String input = scanner.nextLine();

            try {
                value = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error, only numbers bro.");
            }
        }

        double result = convert(value);
        System.out.printf("Results: %.2f%n", result);
    }
}
