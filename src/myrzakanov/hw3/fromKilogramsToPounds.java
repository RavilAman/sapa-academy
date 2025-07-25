package myrzakanov.hw3;

import java.util.Scanner;

public class fromKilogramsToPounds extends AbstractConverter{

    @Override
    public void convert() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to convert from kilogram to pound : ");
        double a = in.nextDouble();
        double convertEq = ( (a * 2.206) - (a * 2.206) % 1e-2 );

        System.out.println("There are "+convertEq+" pound in "+a+" kilogram ");
    }
}
