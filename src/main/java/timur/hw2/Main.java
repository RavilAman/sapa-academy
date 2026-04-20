package timur.hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Square sq = new Square();
        Triangle t = new Triangle();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину: ");
        double num1 = in.nextDouble();
        System.out.println("Введите ширину: ");
        double num2 = in.nextDouble();
        System.out.println("Введите длину: ");
        double num3 = in.nextDouble();

        rec.perimeterCalculator(num1, num2);
        rec.areaCalculator(num1, num2);

        rec.viewP();
        rec.viewA();

        sq.perimeterCalculate(num1);
        sq.areaCalculate(num1);

        sq.viewSp();
        sq.viewSa();

        t.perimeterCalculate(num1,num2,num3);
        t.areaCalculate(num1,num3);
        t.viewTa();
        t.viewTp();
    }
}


