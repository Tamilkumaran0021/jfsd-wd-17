package module_1.day.sixteen_additional_2.multi_threading;

import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        executorServiceCallable();
    }

    public static void fixedThreadPool() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        for (int i = 0; i < 8; i++) {
            executorService.submit(() -> {
                System.out.println("Task with id " + Thread.currentThread().getId());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        Thread.sleep(2000);
        executorService.shutdownNow();
    }

    public static void scheduledThreadPool() throws InterruptedException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(() -> System.out.println("From thread"), 0, 1000, TimeUnit.MILLISECONDS);

        Thread.sleep(2000);
        executorService.shutdownNow();
    }

    public static void executorServiceCallable() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        Future<Integer> future = executorService.submit(() -> {
            Thread.sleep(1000);
            return 0;
        });
        System.out.println("Doing Other work");
        System.out.println(future.get());
        executorService.shutdownNow();
    }
}

// limitations of future
// we have to block the thread to get future's result
// multiple futures cannot be chained together
// no exception handling
