package ulykbekova.hw.too;

public class Rectangle {
    double side;
    public Rectangle(double side){
        this.side=side;
    }
    public void getPerimetr(){
        double perimetr = side*4;
        System.out.println(perimetr);
    }
    public void getAudan(){
        double audan = side*side;
        System.out.println(audan);
    }
}
