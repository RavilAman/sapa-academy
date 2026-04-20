package timur.hw2;

public class Rectangle {
    public double a,b;

    public Rectangle(){}

    public double areaCalculator(double num1,double num2){
        a = (num1 * num2);
        return a;
    }
    public double perimeterCalculator(double num1,double num2){
        b = (num1 + num2)*2;
        return b;
    }
    public void viewP(){
        System.out.println("Периметра прямоугольника: "+b);
    }
    public void viewA(){
        System.out.println("Площадь прямоугольника: "+a);
    }
}
