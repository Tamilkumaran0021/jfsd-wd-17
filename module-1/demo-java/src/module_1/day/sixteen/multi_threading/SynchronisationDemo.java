package module_1.day.sixteen.multi_threading;

public class SynchronisationDemo implements Runnable {

    Display display;
    String name;

    public SynchronisationDemo(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    public void run() {
        display.print(name);
    }

    public static void main(String[] args) throws InterruptedException {
        Display display = new Display();
        Display display1 = new Display();

        SynchronisationDemo myThread1 = new SynchronisationDemo(display, "john");
        SynchronisationDemo myThread2 = new SynchronisationDemo(display1, "peter");
        Thread t1 = new Thread(myThread1);
        Thread t2 = new Thread(myThread2);
        t1.start();
        t2.start();

    }
}

// race condition

class Display {
//    public static synchronized void print(String name) {
//        for (int i = 0; i < 5; i++) {
//            System.out.print("hello ");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(name);
//        }
//        // 1000 lines
//    }

    public static synchronized void print(String name) {
//        synchronized (this) {
        synchronized (Display.class) {
            for (int i = 0; i < 5; i++) {
                System.out.print("hello ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name);
            }
        }
        // 1000 lines
    }
}
