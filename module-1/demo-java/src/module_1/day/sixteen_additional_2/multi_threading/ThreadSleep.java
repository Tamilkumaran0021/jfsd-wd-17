package module_1.day.sixteen_additional_2.multi_threading;

public class ThreadSleep implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSleep myThread = new ThreadSleep();
        Thread thread = new Thread(myThread);
        thread.start();
        thread.interrupt();
        System.out.println("End of main");
    }
}