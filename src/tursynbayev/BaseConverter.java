package tursynbayev;

import java.util.Scanner;

abstract class BaseConverter implements Convert   {
    Scanner scanner = new Scanner(System.in);
    public double readvalue() {
        System.out.print("Enter a number for converting: ");
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Enter a number again.");
            return Double.NaN;
        }
    }
    public void printResult(double result, String unit) {
        System.out.printf("Результат: %.2f %s%n", result, unit);
    }
}
