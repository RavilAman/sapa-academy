package yernat.hw2;

public class Square {

    double a;

    public Square(double a){
        this.a = a;
    }

    public void getPerimeter(){
        double plus = a + a;
        System.out.println(plus);
    }

    public void getArea(){
        double multiple = a * a;
        System.out.println(multiple);
    }
}
