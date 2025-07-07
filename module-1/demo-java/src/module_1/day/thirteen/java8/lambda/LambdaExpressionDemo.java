package module_1.day.thirteen.java8.lambda;

public class LambdaExpressionDemo {
    // Java 8 -> less lines of code -> Functional Programming
    //        -> Functional Interface -> only 1 abstract method
    //                    -> lambda expression
    public static void main(String[] args) {
        I i = (a, b) -> a + b;
//        System.out.println(i.add(100, 200));
        print(i);
    }

    public static void print(I i) {
        System.out.println(i.add(100, 200));
    }
}

class B implements I {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

@FunctionalInterface
interface I {
    int add(int a, int b);
//    int sub();
}
