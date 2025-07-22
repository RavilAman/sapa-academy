package ulykbekova;

public class MainErke {
    public static void main(String[] args){

    Triangle meTriangle= new Triangle(4, 5, 6);
        meTriangle.getPerimetr();
        meTriangle.getAudan();

    Square meSguare= new Square(4, 5);
        meSguare.getPerimetr();
        meSguare.getAudan();

    Rectangle meRectangle= new Rectangle(5);
        meRectangle.getPerimetr();
        meRectangle.getAudan();
    }
}
