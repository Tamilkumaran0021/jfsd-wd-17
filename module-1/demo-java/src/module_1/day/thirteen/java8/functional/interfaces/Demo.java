package module_1.day.thirteen.java8.functional.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Demo {
    // Predicate -> to test your input
    // Function -> converting an input to a desired output
    // Consumer -> accepts a value
    // Supplier -> gives you a value
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 3, 2, 18, 4, 9, 11, 20);
//
//        List<Integer> evenList = new ArrayList<>();
//        List<Integer> sqList = new ArrayList<>();
//
//        for (Integer i : list) {
//            if (i % 2 == 0) {
//                evenList.add(i);
//            }
//        }
//        for (Integer i : evenList) {
//            sqList.add(i * i);
//        }
//        System.out.println(sqList);

        List<Integer> result = list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .sorted((i, j) -> j.compareTo(i))
                .collect(Collectors.toList());

        result.forEach(i -> System.out.println(i));
    }

    public static void predicate(List<Integer> list) {
        Predicate<Integer> predicate = i -> i % 2 == 0;
        Predicate<Integer> predicate1 = i -> i > 10;
        BiPredicate<Integer, Integer> biPredicate = (i, j) -> i > j;
//        IntPredicate
//        LongPredicate
//        DoublePredicate

//        for (Integer i : list) {
//            if (predicate.test(i)) {
//                System.out.println(i);
//            }
//        }
        for (Integer i : list) {
            if (predicate.and(predicate1).test(i)) {
                System.out.println(i);
            }
        }
    }

    public static void function(List<Integer> list) {
        Function<Integer, Integer> function = i -> i * i;
//        BiFunction

        for (Integer i : list) {
            System.out.println(function.apply(i));
        }
    }

    public static void consumer(List<Integer> list) {
        Consumer<Integer> consumer = i -> System.out.println(i);
//        BiConsumer
        for (Integer i : list) {
            consumer.accept(i);
        }
    }

    public static void supplier() {
        Supplier<Integer> supplier = () -> 100;

        System.out.println(supplier.get());
    }

    public static void predicateExample() {
        List<Integer> list = Arrays.asList(10, 3, 2, 18, 4, 9, 11, 20);

        List<Integer> evenList = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }
//        System.out.println(evenList);

        List<Integer> result = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(result);
    }

    public static void
}
