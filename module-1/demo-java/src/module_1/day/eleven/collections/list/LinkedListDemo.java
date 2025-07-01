package module_1.day.eleven.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
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
}
