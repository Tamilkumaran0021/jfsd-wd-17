package module_1.day.sixteen_additional_2.multi_threading;

import java.util.ArrayList;
import java.util.List;

public class Processor {
    private List<Integer> list = new ArrayList<>();
    private final int LIMIT = 5;
    private final int BOTTOM = 0;
    private final Object lock = new Object();
    private int value = 0;

    public void producer() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (list.size() == LIMIT) {
                    System.out.println("Waiting for removing items from the list...");
                    lock.wait();
                } else {
                    System.out.println("Adding: " + value);
                    list.add(value);
                    value++;
                    lock.notify();
                }
            }
        }
    }

    public void consumer() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (list.size() == BOTTOM) {
                    System.out.println("Waiting for adding items to the list...");
                    lock.wait();
                } else {
                    System.out.println("Removing: " + list.remove(--value));
                    lock.notify();
                }
            }
        }
    }


    public static void main(String[] args) {
        Processor processor = new Processor();
        Thread t1 = new Thread(() -> {
            try {
                processor.producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                processor.consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();

    }
}

// Thread -> new -> runnable -> running -> wait/sleep -> terminated