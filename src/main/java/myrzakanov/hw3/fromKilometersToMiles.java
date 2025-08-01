package myrzakanov.hw3;

import java.util.Scanner;

public class fromKilometersToMiles extends AbstractConverter{
    @Override
    public void convert() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to convert from Kilometer to Mile : ");
        double a = in.nextDouble();
        double convertEq = ( (a * 0.62137) - (a * 0.62137)%1e-2);

        System.out.println("There are "+convertEq+" miles in "+a+" kilometer ");
    }
}
