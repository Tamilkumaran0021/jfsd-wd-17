package module_1.day.eleven.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    // ArrayList -> dynamic size
    public static void main(String[] args) {
        // data structure -> create add read update delete search
        List<Integer> list = Arrays.asList(1, 20, 33, 100); // 10 -> 75 % -> 20 -> 40 -> 80
        System.out.println(list);
    }

    public static void arrayListMethods() {
        List list = new ArrayList();
        list.add(100);
        list.add(10);
        list.add(1);
        list.add(1);
        list.add(20);

//        System.out.println(list.get(0));
//        list.set(1, 90);
//        System.out.println(list);

        list.remove(0);
        System.out.println(list.contains(20));
        System.out.println(list.size());
    }

    public static void dynamicSizeAndGenerics() {
        // Generics

        List<Integer> list = new ArrayList<>(); // 10 -> 75 % -> 20 -> 40 -> 80
        list.add(100);
//        list.add("10");
//        list.add(1.00f);
        list.add(1);
        list.add(20);


//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i) / 100);
//        }
    }
}
