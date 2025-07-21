import example.lesson.four.AbstractPolygon;
import example.lesson.four.Square;

public class Main {

    public static void main(String[] args) {

        AbstractPolygon square = new Square();
        square.calculatePerimeter();
        square.calculateArea();
    }
}