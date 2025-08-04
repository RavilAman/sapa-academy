package example.lesson10;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread via extends Thread");
    }
}
