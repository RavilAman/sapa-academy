package badeshov.hw9;

public class MyThread extends Thread {

    private final String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        try {
            for (; ; ) {
                System.out.println(name);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("sleep interrupted");
        }
    }
}
