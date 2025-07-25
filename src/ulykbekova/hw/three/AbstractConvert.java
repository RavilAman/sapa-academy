package ulykbekova.hw.three;

import java.text.DecimalFormat;
import java.util.Scanner;

public abstract class AbstractConvert implements Convert {
    protected Scanner scanner = new Scanner(System.in);
    protected DecimalFormat df = new DecimalFormat("#.00");
    public void runConvert(String s, String v) {
        System.out.println("Введите значения в " + s + ":");
        double a;
        while (true) {
            if (!scanner.hasNextDouble()) {
                System.out.println("Ошибка, пожалуйста введите число");
                scanner.nextLine();
            } else {
                a = scanner.nextDouble();
                double b = convertit(a); //resultat convertasii
                System.out.println(a + " " + s + " = " + df.format(b) + " " + v);
                return;
            }
        }
    }
}