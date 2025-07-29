package example.lesson4;

public class Square extends AbstractPolygon implements Comparable {

    @Override
    public double calculatePerimeter() {
        double a = 7;

        double perimeter = a * 4;

        super.printPerimeter(perimeter);
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double a = 7;

        double area = a * a;

        super.printArea(area);
        return area;
    }

    @Override
    String getFigureName() {
        return "Square";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
