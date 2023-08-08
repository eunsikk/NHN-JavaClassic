package org.nhnacademy.thread;

public class TestExtendedThread2 extends Thread {
    static int totalCount = 0;
    private String message;
    private int loopCount;
    private long delay;

    public TestExtendedThread2(String message, long delay) {
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
                // InterruptedException를 받으면 스레드가 중단될 것으로 예상하고 루프를 종료합니다.
                interrupt();
                break;
            }
        }
        System.out.println("Interrupted : " + isInterrupted());
    }

    public static void main(String[] args) throws InterruptedException {
        TestExtendedThread2 thread1 = new TestExtendedThread2("thread1", 1000);
        TestExtendedThread2 thread2 = new TestExtendedThread2("thread2", 2000);

        thread1.start();
        thread2.start();

        Thread.sleep(5000);
        thread1.interrupt();
    }
}
