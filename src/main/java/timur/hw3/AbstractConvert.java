package timur.hw3;

import java.util.Scanner;

public abstract class AbstractConvert implements Convert {
    public void readAndConvert() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите значение для конвертации: ");
        double inputValue = 0;
        while (true) {
            try {
                inputValue = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Пожалуйста, введите корректное число.");
            }
            double result = convert(inputValue);
            System.out.printf("Результат конвертации: %.2f\n", result);
        }
    }
}
