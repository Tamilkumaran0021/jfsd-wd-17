package module_1.day.nine.oops.polymorphism;

public class Overloading {
    public static void main(String[] args) {
        add(100, 200);
        add(100, 200, 300);
        add(100l, 200, 300);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(long x, int y, int z) {
        System.out.println(x + y + z);
    }

//    public static int add(long a, int b, int c) {
//        System.out.println(a + b + c);
//        return 0;
//    }
}

// method name + no. of arguments
// method name + type of arguments