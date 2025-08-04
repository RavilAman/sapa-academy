package example.lesson10;

public class VolatileFixExample {

    static class FlagRunner implements Runnable {
        volatile boolean running = true; // guarantees visibility

        public void run() {
            System.out.println("Thread started");
            while (running) {
                // spin
            }
            System.out.println("Thread stopped");
        }

        void stop() {
            running = false;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FlagRunner runner = new FlagRunner();
        Thread thread = new Thread(runner);
        thread.start();

        Thread.sleep(1000);
        runner.stop(); // thread sees change
    }
}
