package badeshov.hw2;

import java.util.Scanner;

public class Triangle {

    public void calculatePerimeter() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first side: ");
        double a = in.nextDouble();
        System.out.println("Enter second side: ");
        double b = in.nextDouble();
        System.out.println("Enter third side: ");
        double c = in.nextDouble();

        double perimeter = a + b + c;
        System.out.println("Perimeter = " + perimeter);
    }

    public void calculateArea() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter second side: ");
        double b = in.nextDouble();
        System.out.println("Enter third side: ");
        double c = in.nextDouble();

        double s = 0.5;
        double area = b * c * s;
        System.out.println("Area = " + area);
    }


}
