package module_1.day.sixteen_additional_2.multi_threading;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class ThreadSafeDS {
    //    HashMap vs ConcurrentHashMap
    //    ArrayList vs CopyOnWriteArrayList
    //    HashSet vs CopyOnWriteArraySet
    //    LinkedList vs ConcurrentLinkedQueue
    //    TreeMap vs ConcurrentSkipListMap
    public static void main(String[] args) throws InterruptedException {
//        Map<Integer, Integer> nonThreadSafeMap = new HashMap<>();
//        runTest(nonThreadSafeMap);
//        Map<Integer, Integer> threadSafeMap = new ConcurrentHashMap<>();
//        runTest(threadSafeMap);

        List<Integer> nonThreadSafeList = new ArrayList<>();
        runTest(nonThreadSafeList);
        List<Integer> threadSafeList = new CopyOnWriteArrayList<>();
        runTest(threadSafeList);
    }

    public static void runTest(List<Integer> list) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            int k = i;
            executorService.submit(() -> {
                for (int j = 0; j < 1000; j++) {
                    list.add(k * 1000 + j);
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println(list.size());
    }

    public static void runTest(Map<Integer, Integer> map) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            int k = i;
            executorService.submit(() -> {
                for (int j = 0; j < 1000; j++) {
                    map.put(k * 1000 + j, j);
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println(map.size());
    }
}
