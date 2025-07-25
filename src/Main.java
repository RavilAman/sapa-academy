import badeshov.hw2.Rectangle;
import badeshov.hw2.Square;
import badeshov.hw2.Triangle;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.calculatePerimeter();
        triangle.calculateArea();

        Square square = new Square();
        square.perimeterOfSquare();
        square.areaOfSquare();

        Rectangle rectangle = new Rectangle();
        rectangle.perimeterOfRectangle();
        rectangle.areaOfRectangle();
    }
}