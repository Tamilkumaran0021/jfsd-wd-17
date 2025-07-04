package module_1.day.additional_1.comparator;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
//        Student student1 = new Student("john", 17, "cs");
//        Student student2 = new Student("peter", 18, "cs");
//
////        System.out.println(student1.compareTo(student2));
//        NameComparator nameComparator = new NameComparator();
//        System.out.println(nameComparator.compare(student1, student2));

        sortMapBasedOnValues();
    }

    public static void sortMapBasedOnValues() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("john", 10);
        map.put("peter", 2);
        map.put("adam", 3);
        map.put("zack", -1);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(entries);

        list.sort(new ValueComparator());
        System.out.println(list);
    }

    public static void sortList() {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(10);
        list.add(1000);
        list.add(1);

        System.out.println(list);
        list.sort(new ListComparator());
        System.out.println(list);
    }
}

class ValueComparator implements Comparator<Map.Entry<String, Integer>> {

    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}

class ListComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

