package Thread.nhnacademy.thread;

import java.time.LocalDateTime;

public class TestThreadJoin {
    public static class Task implements Runnable {
        Thread thread;
        String name;
        int loopCount;
        int maxLoopCount;
        int interval;
        static int totalCount; // static totalCount 변수 추가

        public Task(String name, int interval, int maxLoopCount) {
            this.name = name;
            this.interval = interval;
            this.maxLoopCount = maxLoopCount;
            this.thread = new Thread(this); // Thread instance initialization
        }

        public void start() {
            thread.start();
        }

        public void join() throws InterruptedException {
            thread.join();
        }

        @Override
        public void run() {
            getClass().getName();
            System.out.printf("[ %s ] : %s 시작되었습니다.\n", LocalDateTime.now(), getName());
            try {
                while (getLoopCount() < getMaxLoopCount()) {
                    Thread.sleep(getInterval());
                    incrementLoopCount();
                    incTotalCount(); // totalCount를 증가시키는 코드 추가
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("[ %s ] : %s 종료되었습니다.\n", LocalDateTime.now(), getName());
        }

        public void incTotalCount() {
            for (int i = 0; i < 90000; i++) {
                incrementTotalCount(); // Corrected method call
            }
        }

        public static void incrementTotalCount() { // 메서드 이름 변경 (incTotalCount ->
                                                   // incrementTotalCount)
            ++totalCount;
        }

        public static int getTotalCount() {
            return totalCount;
        }

        public String getName() {
            return name;
        }

        public int getInterval() {
            return interval;
        }

        public int getMaxLoopCount() {
            return maxLoopCount;
        }

        public int getLoopCount() {
            return loopCount;
        }

        public void incrementLoopCount() {
            ++loopCount;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task("one", 1000, 3);
        Task task2 = new Task("two", 2000, 3); // delay를 2000ms로 변경
        Task task3 = new Task("three", 3000, 3); // delay를 3000ms로 변경

        System.out.printf("[ %s ] : main에서 스레드를 시작시킵니다.\n", LocalDateTime.now());
        task1.start();
        task2.start();
        task3.start();

        System.out.printf("[ %s ] : main에서 스레드가 종료되길 기다립니다.\n", LocalDateTime.now());
        task1.join();
        task2.join();
        task3.join();

        System.out.printf("[ %s ] : %s 종료되었습니다.\n", LocalDateTime.now(),
                Thread.currentThread().getName());

        System.out.printf("[ %s ] : 총 작업 횟수는 %d 회 입니다.\n", LocalDateTime.now(),
                Task.getTotalCount()); // 총 작업 횟수 출력 코드 추가
    }
}
