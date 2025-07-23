package example.lesson4;

public abstract class AbstractPolygon implements Polygon {

    public void printPerimeter(double perimeter) {
        System.out.println("Perimeter of the " + getFigureName() + " = "+ perimeter);
    }

    public void printArea(double area) {
        System.out.println("Area of the " + getFigureName() + " = " + area);
    }

    abstract String getFigureName();
}
