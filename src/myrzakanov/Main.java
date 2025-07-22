package myrzakanov;

public class Main {
    public static void main(String[] args) {

        Triangle answer1 = new Triangle(4,5,6);
        System.out.println("Perimeter of triangle = "+answer1.perimeterOfTriangle);
        System.out.println("Area of triangle = "+answer1.areaOfTriangle);
        System.out.println();

        Square answer2 = new Square(5);
        System.out.println("Perimeter of Square = "+answer2.perimeterOfSquare);
        System.out.println("Area of Square = "+answer2.areaOfSquare);
        System.out.println();

        Rectangle answer3 = new Rectangle(4,5);
        System.out.println("Perimeter of Rectangle = "+answer3.perimeterOfRectangle);
        System.out.println("Area of Rectangle = "+answer3.areaOfRectangle);
    }
}