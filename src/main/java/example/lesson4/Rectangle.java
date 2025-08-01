package example.lesson4;

public class Rectangle extends AbstractPolygon {

    @Override
    public double calculatePerimeter() {
        double a = 5;
        double b = 13;

        double perimeter = 2 * a + 2 * b;

        super.printPerimeter(perimeter);
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double a = 5;
        double b = 13;

        double area = a * b;

        super.printArea(area);
        return area;
    }

    @Override
    String getFigureName() {
        return "Rectangle";
    }
}
