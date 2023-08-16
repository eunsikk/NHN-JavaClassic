package Thread.nhnacademy.thread;

public class TestExtendedThread3 extends Thread {
    static int totalCount = 0;
    private String message;
    private int loopCount;
    private long delay;

    public TestExtendedThread3(String message, long delay) {
        this.message = message;
        loopCount = 0;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                ++totalCount;
                ++loopCount;
                System.out.println(message + " : " + loopCount + "," + totalCount);
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                interrupt();
                break;
            }
        }
        System.out.println("Interrupted : " + isInterrupted());
    }

    public int getCount() {
        return loopCount;
    }

    public static void main(String[] args) throws InterruptedException {
        TestExtendedThread3 thread1 = new TestExtendedThread3("thread1", 1000);
        TestExtendedThread3 thread2 = new TestExtendedThread3("thread2", 2000);

        thread1.start();
        thread2.start();

        System.out.println(Thread.currentThread().getState() + "," + thread2.getState() + ","
                + thread1.getCount() + "," + thread2.getCount());

        State state1 = thread1.getState();
        State state2 = thread2.getState();
        while (!Thread.currentThread().isInterrupted()) {
            if ((state1 != thread1.getState()) || (state2 != thread2.getState())) {
                state1 = thread1.getState();
                state2 = thread2.getState();
                System.out.println(thread1.getState() + " , " + thread2.getState() + ","
                        + thread1.getCount() + "," + thread2.getCount());
            }
        }
    }
}
