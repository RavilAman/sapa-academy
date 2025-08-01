package myrzakanov;

import myrzakanov.hw3.*;
import java.util.Scanner;

public class MyrzakanovMain {
    public static void main(String[] args) {

        while(true) {
            System.out.println();
            System.out.println("1) From kilometer to mile");
            System.out.println("2) From Celsius to Fahrenheit");
            System.out.println("3) From kilogram to pound");
            System.out.println();

            Scanner scan = new Scanner(System.in);
            System.out.print("Select what you want to convert from the list above : ");
            String b = scan.nextLine();

            if (b.equals("from kilometer to mile") || b.equals("1")) {
                AbstractConverter con = new fromKilometersToMiles();
                con.convert();
            } else if (b.equals("from Celsius to Fahrenheit") || b.equals("2")) {
                AbstractConverter con = new fromCelsiusToFahrenheit();
                con.convert();
            } else if (b.equals("from kilogram to pound") || b.equals("3")) {
                AbstractConverter con = new fromKilogramsToPounds();
                con.convert();
            }else
                System.out.println("Tak delat' nel'zyia vyberite so spiska");


            System.out.print("Would you like to continue? Yes or No: ");
            String s = scan.nextLine();
            if(s.equals("yes") || s.equals("Yes") || s.equals("YES")){
                continue;
            }else
                break;
        }
    }
}