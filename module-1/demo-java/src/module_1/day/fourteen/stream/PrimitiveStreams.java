package module_1.day.fourteen.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    public static void main(String[] args) {
//        stats();
//        mappingPrimitiveStream();
        ranges();
    }

    public static void stats() {
        IntStream intStream = IntStream.of(5, 10, 15, 20);
        IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();

        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getSum());
        System.out.println(intSummaryStatistics.getCount());
    }

    public static void mappingPrimitiveStream() {
        DoubleStream doubleStream = IntStream.of(5, 10, 15, 20)
                .mapToDouble(n -> (double) n);
        doubleStream.forEach(s -> System.out.println(s));
    }

    public static void ranges() {
//        IntStream.range(1,1000).forEach(s -> System.out.print(s));
        IntStream.rangeClosed(1,1000).forEach(s -> System.out.print(s));
    }

}
