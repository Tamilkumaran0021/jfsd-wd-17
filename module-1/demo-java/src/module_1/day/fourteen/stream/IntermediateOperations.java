package module_1.day.fourteen.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
//        doDistinct();
//        doLimit();
        doFlatMap();
    }

    public static void doFlatMap() {
        List<String> list1 = Arrays.asList("john", "peter");
        List<String> list2 = Arrays.asList("zack", "joe", "john");
        Stream<List<String>> streamOfLists = Stream.of(list1, list2);


        Stream<String> stringStream = streamOfLists.flatMap(list -> list.stream());
        stringStream.forEach(s -> System.out.println(s));
    }

    public static void doSort() {

    }

    public static void doMap() {

    }

    public static void doLimit() {
        List<String> list = Arrays.asList("john", "peter", "zack", "joe", "john");
        list.stream().limit(2).forEach(s -> System.out.println(s));
    }

    public static void doDistinct() {
        Stream.of("john", "peter", "zack", "joe", "john")
                .peek(s -> System.out.println(" 1." + s))
                .distinct()
                .forEach(s -> System.out.println(" 2." + s));
    }

    public static void doFilter() {

    }
}
