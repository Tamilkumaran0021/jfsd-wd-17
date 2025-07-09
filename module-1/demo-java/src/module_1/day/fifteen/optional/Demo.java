package module_1.day.fifteen.optional;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
//        System.out.println(print(""));
//        System.out.println(print("hello"));
//        System.out.println(print(null));

//        System.out.println(printOptional(null).isPresent());
//        System.out.println(printOptional("null").get());
//        System.out.println(printOptional(null).orElse("hello"));
//        System.out.println(printOptional(null).orElseThrow(() -> new RuntimeException()));
//        printOptional(null).ifPresent();
    }

    public static String print(String s) {
        if (s != null)
            return s.toUpperCase();
        return "";
    }

    public static Optional<String> printOptional(String s) {
        Optional optional = Optional.ofNullable(s);
        return optional;
    }
}
