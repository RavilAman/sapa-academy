package example.lesson4;

import java.util.Scanner;

public class Triangle extends AbstractPolygon {

    public double calculatePerimeter() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first side: ");
        double a = in.nextDouble();
        System.out.println("Enter second side: ");
        double b = in.nextDouble();
        System.out.println("Enter third side: ");
        double c = in.nextDouble();

        double perimeter = a + b + c;

        super.printPerimeter(perimeter);
        return perimeter;
    }

    public double calculateArea() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter second side: ");
        double b = in.nextDouble();
        System.out.println("Enter third side: ");
        double c = in.nextDouble();

        double s = 0.5;
        double area = b * c * s;

        super.printArea(area);
        return area;
    }

    @Override
    String getFigureName() {
        return "Triangle";
    }
}
