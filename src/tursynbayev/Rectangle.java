package tursynbayev;

public class Rectangle {
    double a, b;

    public Rectangle(double width, double height) {
        this.a = width;
        this.b = height;
    }

    public double getPerimeter() {
        return 2 * (a + b);
    }

    public double getArea() {
        return a * b;
    }

}
