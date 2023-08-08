package org.nhnacademy.thread;

public class RunnableThread implements Runnable {
    Thread thread;
    private String message;
    private int loopCount;
    private long delay;

    public RunnableThread(String message, long delay) {
        thread = new Thread(this);
        this.message = message;
        this.loopCount = 0;
        this.delay = delay;
    }

    public void start() {
        thread.start();
    }

    public void stop() {
        thread.interrupt();
    }

    @Override
    public void run() {
        System.out.println(message + "를 시작합니다");
        while (!thread.isInterrupted()) {
            try {
                ++loopCount;
                System.out.println("스레드[ " + message + ":" + loopCount + " ] 동작 중");
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                thread.interrupt();
            }
        }
        System.out.println("스레드[ " + message + " ]가 중단되었습니다");
    }
}
