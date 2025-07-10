package module_1.day.sixteen.multi_threading;

public class ThreadJoin implements Runnable {
//
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Child Thread");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }

    static Thread mt;

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
            try {
                mt.join();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadJoin.mt = Thread.currentThread();
        ThreadJoin myThread = new ThreadJoin();
        Thread thread = new Thread(myThread);
        thread.start();
        thread.join();
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