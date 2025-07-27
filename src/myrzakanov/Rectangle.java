package myrzakanov;

public class Rectangle {
    public double perimeterOfRectangle;
    public double areaOfRectangle;

    public Rectangle(double a, double b) {
        this.perimeterOfRectangle = (a+b)*2;
        this.areaOfRectangle = a * b;
    }
}