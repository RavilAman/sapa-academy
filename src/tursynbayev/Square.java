package tursynbayev;

public class Square {
    double a;

    public Square(double side) {
        this.a = side;
    }

    public double getPerimeter() {
        return 4 * a;
    }

    public double getArea() {
        return a * a;
    }

}
