package module_1.day.thirteen.java8.lambda;

import module_1.day.additional_1.comparator.Student;

import java.util.*;

public class ComparatorLambda {
    public static void main(String[] args) {
        Student student1 = new Student("john", 17, "cs");
        Student student2 = new Student("peter", 18, "cs");

////        System.out.println(student1.compareTo(student2));
//        NameComparator nameComparator = new NameComparator();
//        System.out.println(nameComparator.compare(student1, student2));

        Comparator<Student> comparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        System.out.println(comparator.compare(student1, student2));
    }

}


class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
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


