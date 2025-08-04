package example.lesson10;

import java.util.Scanner;

public class MultithreadingMain {

    public static void main(String[] args) {
        // Старт нового потока через наследование от thread
//        new MyThread().start();
//
//        // Старт нового потока через реализацию Runnable - предпочитаемый метод
//        Runnable task = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread via Runnable");
//            }
//        };
//        new Thread(task).start();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Задача выполняется потоком с именем: " + Thread.currentThread().getName() + ": " + "Введите код валюты: ");
            String code = scanner.nextLine();
            CurrencyFinder finder = new CurrencyFinder(code);
            Thread newThread = new Thread(finder);
            newThread.start();
            System.out.println("Задача выполняется потоком с именем: " + Thread.currentThread().getName() + ": " + "Значение скоро отобразиться у вас на экране...");
        }
    }
}
