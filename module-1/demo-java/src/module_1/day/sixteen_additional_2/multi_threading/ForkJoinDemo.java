package module_1.day.sixteen_additional_2.multi_threading;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinDemo {
    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = i + 1;
        }

        SumTask sumTask = new SumTask(array, 0, array.length - 1);

        ForkJoinPool pool = new ForkJoinPool();
        int sum = pool.invoke(sumTask);
        System.out.println(sum);
//        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}

class SumTask extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 20;
    private int[] array;
    private int start;
    private int end;

    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= THRESHOLD) {
            return sum();
        }
        int middle = (start + end) / 2;
        SumTask leftTask = new SumTask(array, start, middle);
        SumTask rightTask = new SumTask(array, middle, end);

        leftTask.fork();
        int rightResult = rightTask.compute();
        int leftResult = leftTask.join();

        return leftResult + rightResult;
    }

    private int sum() {
        int total = 0;
        for (int i = start; i < end; i++) {
            total += array[i];
        }
        return total;
    }
}