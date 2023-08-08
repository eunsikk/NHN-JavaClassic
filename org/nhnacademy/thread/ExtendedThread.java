package org.nhnacademy.thread;

public class ExtendedThread extends Thread {
    private String message;
    private int loopCount;
    private long delay;

    public ExtendedThread(String message) {
        this.message = message;
        loopCount = 0;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                ++loopCount;
                System.out.println(message + " : " + loopCount);
                Thread.sleep(delay);
            } catch (InterruptedException e) { // InterruptedException로 thread를 중지시켜야한다.
                interrupt();
            }
        }
    }
}
