package myrzakanov;
import static java.lang.Math.sqrt;

public class Triangle {
    public double perimeterOfTriangle;
    public double areaOfTriangle;

    public Triangle(double a, double b, double c){
        this.perimeterOfTriangle = a+b+c;
        this.areaOfTriangle = sqrt(perimeterOfTriangle/2*(perimeterOfTriangle/2-a)*(perimeterOfTriangle/2-b)*(perimeterOfTriangle/2-c));
    }
}
