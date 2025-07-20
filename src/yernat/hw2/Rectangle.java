package yernat.hw2;

import static java.lang.Math.sqrt;

public class Rectangle {
    double a, b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;

    }

    public void getPerimeter(){
        double plus = a + b;
        System.out.println(plus);

    }
    public void getArea(){
        double multiple = a * b;
        System.out.println(multiple);
    }

}
