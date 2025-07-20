package yernat.hw2;

public class Main {
    public static void main(String[] args){
        Triangle myTriangle = new Triangle(4,5,6);
        Rectangle myRectangle = new Rectangle(4,5);
        Square mySquare = new Square(4);

        myTriangle.getPerimeter();
        myTriangle.getArea();

        myRectangle.getPerimeter();
        myRectangle.getArea();

        mySquare.getPerimeter();
        mySquare.getArea();

    }
}

