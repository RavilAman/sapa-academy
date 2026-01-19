package timur.hw2;

public class Square {
    double area, per;
     public Square(){

     }
     public double areaCalculate(double num1){
         area = (num1 * num1);
         return area;
     }
     public double perimeterCalculate(double num1){
         per = (num1 * 4);
         return per;
     }
     public void viewSa(){
         System.out.println("Плоащдь квадрата: " + area);
     }
     public void viewSp(){
         System.out.println("Периметр квадрата: " + per);
     }
}
