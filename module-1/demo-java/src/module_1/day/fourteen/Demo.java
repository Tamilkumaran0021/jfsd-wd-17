package module_1.day.fourteen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);

        final int x = 12; // final or effectively final

        Predicate<String> predicate = s -> {
            System.out.println(x);

            return false;
        };

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

//        predicate.test(100);
    }
}
