package timur.hw3;

import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем объекты для всех конвертеров
        CeltoFahr celToFahr = new CeltoFahr();
        KmtoMi kmToMi = new KmtoMi();
        KgtoLb kgToLb = new KgtoLb();

        // Цикл программы
        while (true) {
            // Печатаем доступные варианты для конверсии
            System.out.println("Выберите единицу измерения для конверсии:");
            System.out.println("1 - Цельсий в Фаренгейты");
            System.out.println("2 - Километры в Мили");
            System.out.println("3 - Килограммы в Фунты");
            System.out.println("4 - Выход");

            // Ввод выбора пользователем
            String choice = scanner.nextLine();

            // Логика для конверсии
            switch (choice) {
                case "1":
                    celToFahr.readAndConvert();
                    break;
                case "2":
                    kmToMi.readAndConvert();
                    break;
                case "3":
                    kgToLb.readAndConvert();
                    break;
                case "4":
                    System.out.println("Завершаю программу...");
                    return; // Завершаем программу
                default:
                    System.out.println("Ошибка! Неверный выбор. Пожалуйста, выберите правильную опцию.");
                    break;
            }

            // Запрашиваем, хочет ли пользователь продолжить
            System.out.println("Хотите продолжить? (да/нет):");
            String continueChoice = scanner.nextLine();
            if (!continueChoice.equalsIgnoreCase("да")) {
                System.out.println("Завершаю программу...");
                break;
            }
        }
    }
}
