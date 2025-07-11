package module_1.day.sixteen_additional_2.multi_threading;

public class ThreadPriority implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
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
        thread.setPriority(10);
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
