package ulykbekova.hw.two;

public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void getPerimetr(){
        double perimetr = a+c+b;
        System.out.println( perimetr);
    }

    public void getAudan(){
        double polaudan = (a+b+c)/2;
        double audan =Math.sqrt((polaudan*(polaudan-a)*(polaudan-c)*(polaudan-b)));
        System.out.println(audan);
    }
 }