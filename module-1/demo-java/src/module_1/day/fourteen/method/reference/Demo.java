package module_1.day.fourteen.method.reference;

import java.util.Comparator;

public class Demo {
    public void add(int a, int b) {
        System.out.println("instance method reference");
    }

    public static void print(int a, int b) {
        System.out.println(a + b);
    }

    public Demo(int a, int b) {
        System.out.println("from constructor");
    }

    public static void main(String[] args) {
//        I i = (a, b) -> System.out.println(a + b);
//        I i = Demo::print; // static method reference
//        i.add(100, 200);

//        Demo demo = new Demo(100, 200);
//        I i = demo::add; // instance method reference
//        i.add(100, 200);


        I i = Demo::new; // constructor method reference

        Comparator<Integer> comparator = Integer::compareTo;


    }
}


interface I {
    void add(int a, int b);
}