package yernat.hw2;

import static java.lang.Math.sqrt;

public class Triangle {
    double a, b, c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getPerimeter(){
        double plus = a + b + c;
        System.out.println(plus);
    }
    public void getArea(){
        double d = (a+b+c)/2;
        double multiple = sqrt(d * (d-a) * (d-b) * (d-c));
        System.out.println(multiple);
    }
}

