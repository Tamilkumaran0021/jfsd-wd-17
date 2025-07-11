package module_1.day.sixteen_additional_2.multi_threading;

public class DaemonThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("inside child sync block");
            }
        });
        thread.setDaemon(true);
        thread.start();
        System.out.println("Main started");


    }
}

// reentrant lock --> synchronisation