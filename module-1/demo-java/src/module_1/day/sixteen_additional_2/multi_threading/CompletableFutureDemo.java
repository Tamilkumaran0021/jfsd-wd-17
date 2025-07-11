package module_1.day.sixteen_additional_2.multi_threading;

import java.util.concurrent.*;

public class CompletableFutureDemo {
// limitations of future
// we have to block the thread to get future's result
// multiple futures cannot be chained together
// no exception handling

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        errorHandling();
    }

    public static void completableFutureRunAsync() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Child thread");
        });
        System.out.println(future.get());
    }

    public static void completableFutureSupplyAsync() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Child thread");
            return "from child thread";
        });

        System.out.println(future.get());

        Executor executor = Executors.newFixedThreadPool(8);
        future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Child thread");
            return "from child thread";
        }, executor);

        System.out.println(future.get());
    }

    public static void thenApply() throws ExecutionException, InterruptedException {
        CompletableFuture<String> whatsYourName = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Java";
        }).thenApply(name -> "hello " + name);

//        CompletableFuture<String> greetingsFuture = whatsYourName.thenApply(name -> "hello " + name);
        System.out.println(whatsYourName.get());
    }

    public static void thenAccept() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> whatsYourName = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Java";
        }).thenAccept(name -> System.out.println(name));

//        CompletableFuture<String> greetingsFuture = whatsYourName.thenApply(name -> "hello " + name);
        System.out.println(whatsYourName.get());
    }

    public static void combineFuture() throws ExecutionException, InterruptedException {
        CompletableFuture<Double> weightInKgFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 65.0;
        });

        CompletableFuture<Double> heightInCmFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 172.0;
        });

        CompletableFuture<Double> combinedFuture = weightInKgFuture
                .thenCombine(heightInCmFuture, (weightInKg, heightInCm) -> weightInKg / ((heightInCm / 100) * (heightInCm / 100)));

        System.out.println(combinedFuture.get());
    }

    public static void errorHandling() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture
                .supplyAsync(() -> "some result")
                .thenApply(result -> {
                    System.out.println(1 / 0);
                    return "processed " + result;
                })
                .exceptionally(ex -> {
                    System.out.println(ex.getMessage());
                    return "Unknown!!";
                });

        System.out.println(future.get());

    }
}
