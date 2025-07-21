package tursynbayev;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,2,3);
        Square square = new Square(2);
        Rectangle rectangular = new Rectangle(1,2);

        System.out.println("Triangle perimetr: " + triangle.getPerimeter());
        System.out.println("Triangle area: " + triangle.getArea());

        System.out.println("Square perimetr: " + square.getPerimeter());
        System.out.println("Square area: " + square.getArea());

        System.out.println("Rectangle perimetr: " + rectangular.getPerimeter());
        System.out.println("Rectangle area: " + rectangular.getArea());
    }

}
