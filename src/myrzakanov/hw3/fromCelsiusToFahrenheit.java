package myrzakanov.hw3;

import java.util.Scanner;

public class fromCelsiusToFahrenheit extends AbstractConverter {

    @Override
    public void convert() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to convert from Celsius to Fahrenheit : ");
        double a = in.nextDouble();
        double convertEq = ( ((a * 9 / 5 ) + 32)-((a*9/5)+32)%1e-2);

        System.out.println("There are "+convertEq+" Fahrenheit in "+a+" Celsius ");
    }
}
