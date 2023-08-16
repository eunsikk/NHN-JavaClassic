package Thread.nhnacademy.thread;

public class TestRunnableThread {
    public static void main(String[] args) throws InterruptedException {
        RunnableThread runnableThread = new RunnableThread("Thread-0", 1000);

        runnableThread.start();

        Thread.sleep(5000);

        runnableThread.stop();

        runnableThread.thread.join();
    }
}
