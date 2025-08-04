package example.lesson10;

public class VolatileProblemExample {

    static class FlagRunner implements Runnable {
        boolean running = true;

        public void run() {
            System.out.println("Thread started");
            while (running) {
                // do nothing
            }
            System.out.println("Thread stopped");
        }

        void stop() {
            running = false; // may not be visible to thread!
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FlagRunner runner = new FlagRunner();
        Thread thread = new Thread(runner);
        thread.start();

        Thread.sleep(1000);
        runner.stop(); // thread might never stop!
    }
}
