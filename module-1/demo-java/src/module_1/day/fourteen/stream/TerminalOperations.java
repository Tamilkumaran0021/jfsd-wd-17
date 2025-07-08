package module_1.day.fourteen.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperations {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("john", "peter", "zack", "joe");
//        doMinAndMax();
//        doCount();
//        doFindAnyFindFirst();
//        doMatches();
//        doForEach();
//        doReduce1();
//        doReduce2();
//        doReduce3();
        doCollect();
    }

    public static void doCollect() {
        List<String> list = Arrays.asList("john", "peter", "zack", "joe");
        StringBuilder stringBuilder = list.stream()
                .collect(() -> new StringBuilder(), (sb, str) -> sb.append(str), (sb1, sb2) -> sb1.append(sb2));
        System.out.println(stringBuilder);
    }

    public static void doReduce1() {
        List<String> list = Arrays.asList("john", "peter", "zack", "joe");
        String result = list.stream().reduce("", (s, c) -> s + c);
//        String result = list.stream().filter(s -> s.length() > 10).reduce("demo", (s, c) -> s + c);
        System.out.println(result);
    }

    public static void doReduce2() {
        List<String> list = Arrays.asList("john", "peter", "zack", "joe");
        String result = list.stream().filter(s -> s.length() > 10).reduce((s, c) -> s + c).get();
        System.out.println(result);
    }

    public static void doReduce3() {
        List<String> list = Arrays.asList("john", "peter", "zack", "joe");
        int totalLength = list.stream().reduce(0, (n, str) -> n + str.length(), (n1, n2) -> n1 + n2);
        // 4+5+4+3
        // 4+5    4+3
        // 9       7

        System.out.println(totalLength);
    }

    public static void doForEach() {
        List<String> list = Arrays.asList("john", "peter", "zack", "joe");
//        list.forEach(i -> System.out.println(i));
        list.forEach(System.out::println);
    }

    public static void doMatches() {
        List<String> list = Arrays.asList("john", "peter", "zack", "joe");

        System.out.println(list.stream().anyMatch(s -> s.startsWith("z")));
        System.out.println(list.stream().allMatch(s -> s.startsWith("z")));
        System.out.println(list.stream().noneMatch(s -> s.startsWith("z")));
    }

    public static void doFindAnyFindFirst() {
        List<String> list = Arrays.asList("john", "peter", "zack", "joe");
        System.out.println(list.stream().findAny().get());
        System.out.println(list.stream().findFirst().get());
    }

    public static void doCount() {
        List<String> list = Arrays.asList("john", "peter", "zack", "joe");
        System.out.println(list.stream().count());
    }

    public static void doMinAndMax() {
        List<String> list = Arrays.asList("john", "peter", "zack", "joe");

        Optional<String> min = list.stream().min((s1, s2) -> s1.length() - s2.length());
        System.out.println(min.get());

        Optional<String> max = list.stream().max((s1, s2) -> s1.length() - s2.length());
        System.out.println(max.get());
    }
}
