package module_1.day.ten.oops.abstraction.final_key;

public class FinalDemo {
    public static void main(String[] args) {
//        final double pi = 3.14;
//        pi = 4.001;

    }
}

// final
//   - variable -> it will be considered as a constant value
//   - method   -> it cannot be overridden
//   - class    -> it cannot be extended


final class Parent {
    public final void add(int a, int b) {
        System.out.println(a + b);
    }
}

//class Child extends Parent {
////    public void add(int a, int b) {
////        System.out.println(a * b);
////    }
//
//    public void sub(){
//
//    }
//}