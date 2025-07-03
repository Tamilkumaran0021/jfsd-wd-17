package module_1.day.eleven_twelve.collections.generics;

import java.util.Arrays;
import java.util.List;

public class GenericFunctionDemo {

    public <V> void add(V obj1, V obj2) {
        System.out.println(obj1.equals(obj2));
    }

    // ? -> wild card
    public <V> void add(List<?> list, V obj2) {

    }

    public static void main(String[] args) {
        GenericFunctionDemo demo = new GenericFunctionDemo();
        demo.add(1, 2);
        demo.add(1.01, 2.002);
        demo.add("hello", "world");
        demo.add(Arrays.asList(1, 2, 3), 100);
    }
}
