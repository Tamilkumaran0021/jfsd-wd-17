package module_1.day.fourteen.stream;

import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
//        sequentialAddition();
        parallelAddition();
    }

    public static void sequentialAddition() {
        int sum = Stream.of(10, 20, 30, 40, 50, 60)
                .mapToInt(n -> n.intValue())
                .sum();
        System.out.println(sum);
    }

    public static void parallelAddition() {
        int sum = Stream.of(10, 20, 30, 40, 50, 60)
                .parallel()
                .mapToInt(n -> n.intValue())
                .sum();
        System.out.println(sum);
    }
}
