package ulykbekova;

import ulykbekova.hw.six.ValueBox;
import ulykbekova.hw.two.Rectangle;
import ulykbekova.hw.two.Square;
import ulykbekova.hw.two.Triangle;

import java.util.Scanner;

public class MainErke {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Напишите 1 число ");
        int a= scanner.nextInt();
        System.out.println("Напишите 2 число ");
        int b= scanner.nextInt();
        ValueBox<Integer>box1=new ValueBox<>(a);
        ValueBox<Integer>box2=new ValueBox<>(b);
        System.out.println("из двух чисел максимальное ="+ValueBox.max(box1, box2));
    }
}
