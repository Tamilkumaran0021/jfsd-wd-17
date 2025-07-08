package module_1.day.fourteen.method.reference;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferenceTypes {
    public static void main(String[] args) {

    }

    // instance method reference
    public static void boundMethodReference() {
        String name = "hello world";

        Supplier<String> upperL = () -> name.toUpperCase();
        Supplier<String> upperMR = name::toUpperCase;
        System.out.println(upperMR.get());

        Predicate<String> titleL = s -> name.startsWith(s);
        Predicate<String> titleMR = name::startsWith;
    }

    // static method reference
    public static void unboundMethodReference() {
        Function<String, String> upperL = s -> s.toUpperCase();
        Function<String, String> upperMR = String::toUpperCase;
    }

    public static void constructorMethodReference() {
        Supplier<StringBuilder> sbL = () -> new StringBuilder();
        Supplier<StringBuilder> sbMR = StringBuilder::new;
    }

}
