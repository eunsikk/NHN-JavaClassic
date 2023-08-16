package Thread.nhnacademy.thread;

import java.time.LocalDateTime;
import javax.management.RuntimeErrorException;

public class TestSynchronizedCounter {
    static class SynchronizedCounter {
        private static int count = 0;

        public synchronized void increment() throws InterruptedException {
            System.out.printf("[ %s ] : %s - 들어가기\n", LocalDateTime.now(),
                    Thread.currentThread().getName());
            this.count++;
            System.out.printf("[ %s ] : %s - count : %d\n", LocalDateTime.now(),
                    Thread.currentThread().getName(), this.count);
            Thread.sleep(1000);
            System.out.printf("[ %s ] : %s - 나오기\n", LocalDateTime.now(),
                    Thread.currentThread().getName());
        }

        public synchronized void decrement() {
            count--;
        }

        public synchronized int value() {
            return count;
        }

        public String toString() {
            return String.valueOf(this.count);
        }
    }

    static class CountBox extends Thread {
        SynchronizedCounter counter;

        public CountBox() {
            this.counter = new SynchronizedCounter();
        }

        @Override
        public void run() {
            while (true) {
                try {
                    this.counter.increment();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        CountBox cb1 = new CountBox();
        CountBox cb2 = new CountBox();

        cb1.start();
        cb2.start();
    }
}
