package timur.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.next();
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.println("Введите пол: ");
        String sex = scanner.next();
        System.out.println("Введите вес: ");
        double weight = scanner.nextDouble();
        System.out.println("Введите рост");
        double height = scanner.nextDouble();
        Person person = new Person(name, age, sex, weight, height);
        person.introduce();

    }
}
