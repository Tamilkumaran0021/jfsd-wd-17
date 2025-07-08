package module_1.day.fourteen.stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {
    public static void main(String[] args) {
//        doAveragingInt();
//        doJoining();
//        doCollectToMap1();
        doCollectToMap2();
    }

    public static void doCollectToMap1() {
        Stream<String> names = Stream.of("john", "peter", "zack");
        Map<String, Integer> map = names.collect(Collectors.toMap(s -> s.toUpperCase(), s -> s.length()));
        System.out.println(map);
    }

    public static void doCollectToMap2() {
        Stream<String> names = Stream.of("john", "peter", "zack");
        Map<Integer, String> map = names.collect(Collectors.toMap(s -> s.length(), s -> s.toUpperCase(), (s1, s2) -> s1 + "," + s2));
        System.out.println(map);
    }

    public static void doJoining() {
        String s = Stream.of("john", "peter", "zack")
                .collect(Collectors.joining(":"));
        System.out.println(s);
    }

    public static void doAveragingInt() {
        Double avg = Stream.of("john", "peter", "zack")
                .collect(Collectors.averagingInt(s -> s.length()));
        System.out.println(avg);
    }
}
