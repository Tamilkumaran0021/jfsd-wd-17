package module_1.day.fifteen;

import java.util.*;

public class OtherFeatures {

    public static void main(String[] args) {
//        System.out.println('\u265B'); // unicode

    }

    public static void switchLambda() {
        int day = 4;
        String result = switch (day) {
            case 1 -> {
                yield "sun";
            }
            case 2 -> "mon";
            default -> "invalid input";
        };

        System.out.println(result);
    }

    public static void stringContentBlock() {
        //        String s = "hello \n" +
//                "world";
//
//        System.out.println(s);

        String s = """
                hello 
                world
                """;
        System.out.println(s);
    }

    public static void streamMethods() {
        List<Integer> list = Arrays.asList(10, 2, 30, 3, 40);

        System.out.println(list.stream().takeWhile(x -> x % 5 == 0).toList());
        System.out.println(list.stream().dropWhile(x -> x % 5 == 0).toList());
    }

    public static void immutableCollection() {
        // Immutable List
//        List<Integer> list = Arrays.asList(100);
//        List<Integer> list = List.of(100);

//        list.set(0, 200);
////        list.remove(0);
//        System.out.println(list);

//        Map.of(1, "john", 2, "peter");
//        Set.of(1, 2, 3);
    }


}
