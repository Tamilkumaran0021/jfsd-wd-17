package module_1.day.sixteen.multi_threading;

public class ThreadYield implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
            Thread.yield();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CreateThread myThread = new CreateThread();
        Thread thread = new Thread(myThread);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}