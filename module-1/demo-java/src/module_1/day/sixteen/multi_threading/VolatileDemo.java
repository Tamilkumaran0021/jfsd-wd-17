package module_1.day.sixteen.multi_threading;

public class VolatileDemo {
    private volatile int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void increaseCounter() {
        ++counter;
    }

    public static void main(String[] args) {
        VolatileDemo demo = new VolatileDemo();
        Thread thread1 = new Thread(() -> {
            int oldValue = demo.getCounter();
            System.out.println("Thread " + Thread.currentThread().getId() + " old value = " + oldValue);
            demo.increaseCounter();
            int newValue = demo.getCounter();
            System.out.println("Thread " + Thread.currentThread().getId() + " new value = " + newValue);
        });
        Thread thread2 = new Thread(() -> {
            int oldValue = demo.getCounter();
            System.out.println("Thread " + Thread.currentThread().getId() + " old value = " + oldValue);
            demo.increaseCounter();
            int newValue = demo.getCounter();
            System.out.println("Thread " + Thread.currentThread().getId() + " new value = " + newValue);
        });

        thread1.start();
        thread2.start();
    }
}
