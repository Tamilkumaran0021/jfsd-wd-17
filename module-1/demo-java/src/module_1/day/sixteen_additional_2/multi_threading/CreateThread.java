package module_1.day.sixteen_additional_2.multi_threading;

//public class MyThread extends Thread {
public class CreateThread implements Runnable {

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
//        System.out.println("hello world");
//        Thread.sleep(2000);
//        System.out.println(1 / 0);

//        MyThread myThread = new MyThread();
////        myThread.run();
//        myThread.start();

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
