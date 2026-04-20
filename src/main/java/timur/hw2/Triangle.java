package timur.hw2;

public class Triangle {
    double ta, tb;

    public Triangle(){

    }
    public double areaCalculate(double num1, double num3){
        ta = (num1*num3);
        return ta;
    }
    public double perimeterCalculate(double num1, double num2, double num3) {
        tb = (num1 + num2 + num3);
        return tb;

    }
    public void viewTa(){
        System.out.println("Площадь треугольника: " + ta);
    }
    public void viewTp(){
        System.out.println("Периметр треугольника: " + tb);
    }

}
