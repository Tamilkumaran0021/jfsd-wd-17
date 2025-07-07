package module_1.day.thirteen.java8.interfaces;

import static module_1.day.thirteen.java8.interfaces.A.print;

public class Demo {
    public static void main(String[] args) {
        I i = new A();
        i.sub();

        I.printI();
//        printI();
        A.print();
        print();
    }
}

interface I {
    void add();

    //    void sub();
    default void sub() {
        System.out.println("sub method I");
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    static void printI() {

    }
}

interface J {
    default void sub() {
        System.out.println("sub method J");
    }
}

class A implements I, J {

    @Override
    public void add() {
        System.out.println();
    }

    @Override
    public void sub() {
        I.super.sub();
    }

    static void print() {

    }
}

class B implements I {

    @Override
    public void add() {
        System.out.println();
    }
}
