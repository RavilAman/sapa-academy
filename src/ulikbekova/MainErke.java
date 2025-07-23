package ulikbekova;

import java.util.Scanner;

public class MainErke {
    public static void main(String[] arsg) {
        Scanner scanner = new Scanner(System.in);
        AbstraktConvert converter;
        System.out.println("Что вы хотите конвертировать?");
        while (true) {
            System.out.println("Введите цифру 1/2/3");
            System.out.println("1. Цельсий в Фаренгейт");
            System.out.println("2. Километры в мили");
            System.out.println("3. Кмлограммы в фунты");


            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    converter = new CofF();
                    converter.runConvert("Цельция", "Фарангейт");
                    break;
                case "2":
                    converter = new kiloofmil();
                    converter.runConvert("Километр", "Миль");
                    break;
                case "3":
                    converter = new kilooffunt();
                    converter.runConvert("Килограмм", "Фунтов");
                    break;
                default:
                    System.out.println("Ошибка, выберите цифру из заданного диапазона");
                    continue;
            }
            System.out.println("Хотите продолжить?");
            while (true) {
                System.out.println(" да/нет");
                String input2 = scanner.nextLine();
                if (input2.equals("да")) {
                    break;
                } else if (input2.equals("нет")) {
                    System.out.println("программа завершена");
                    System.exit(0);
                } else {
                    System.out.println("Ошибка: введите правильный диапазон");
                }
            }

        }


    }
}


