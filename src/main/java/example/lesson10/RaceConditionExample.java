package example.lesson10;

public class RaceConditionExample {

    static class Counter {
        int count = 0;

        void increment() {
            count++; // NOT ATOMIC — may cause race condition
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count (should be 20000): " + counter.count);
    }
}

