package ulykbekova.hw.two;

public class Square {
    double a;
    double b;
    public Square(double a, double b){
        this.a=a;
        this.b=b;

    }
    public void getPerimetr(){
        double perimetr = (a+b)*2;
        System.out.println( perimetr);
    }
    public void getAudan(){
        double audan = a*b;
        System.out.println(audan);
    }
}