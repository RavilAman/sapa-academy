import example.lesson.four.AbstractPolygon;
import example.lesson.four.Rectangle;

public class Main {

    public static void main(String[] args) {

        AbstractPolygon polygon = new Rectangle();
        polygon.calculatePerimeter();
        polygon.calculateArea();
    }
}