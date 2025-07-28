import example.lesson4.AbstractPolygon;
import example.lesson4.Rectangle;

public class Main {

    public static void main(String[] args) {

        AbstractPolygon polygon = new Rectangle();
        polygon.calculatePerimeter();
        polygon.calculateArea();
    }
}