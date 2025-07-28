package badeshov.hw3;

import java.util.Scanner;

public abstract class AbstractConvert implements Convert {

    public void printConversion(double convertedValue) {
        System.out.format("Conversion of " + getUnitOfMeasurement() + ": %.2f\n", convertedValue);
    }

    public double readValue() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите значение для конвертации:");
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Ошибка!!! Введите число!");
            }
            scanner.next();
        }
    }

    abstract String getUnitOfMeasurement();
}
