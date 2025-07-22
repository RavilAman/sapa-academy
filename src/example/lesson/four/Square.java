package example.lesson.four;

public class Square extends AbstractPolygon {

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
}
