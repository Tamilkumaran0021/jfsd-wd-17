package module_1.day.sixteen.multi_threading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
    private static int counterSync = 0;
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void incrementSync() {
        for (int i = 0; i < 100000; i++) {
            counterSync++;
        }
    }

    public static void increment() {
        for (int i = 0; i < 100000; i++) {
            counter.getAndIncrement();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> increment());
        Thread t2 = new Thread(() -> increment());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter);
    }
}
