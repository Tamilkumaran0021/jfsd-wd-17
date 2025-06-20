package day.three;

public class StaticDemo {
    static int x = 1000; // global variable or class variable
    int y = 2000;

    static {
        System.out.println("from static block");
    }

    public static void main(String[] args) {
//        GlobalLocalVariable g1 = new GlobalLocalVariable();
//        g1.x = 300;
//
//        GlobalLocalVariable g2 = new GlobalLocalVariable();
//        g2.x = 400;


//        System.out.println(GlobalLocalVariable.x);
//        System.out.println(GlobalLocalVariable.y);

//        GlobalLocalVariable.add();

        System.out.println(x);
        add();

        StaticDemo s1 = new StaticDemo();
        System.out.println(s1.y);
        s1.print();
    }

    public static void add() {

    }

    public void print() {
        System.out.println(x);
        System.out.println(y);
        add();
    }
}

// static functions
//     -> you can access static variables/static functions
//     -> to access non static variable/non static functions , we need to create an object

// non static functions
//     -> you can access both static variables/static functions and non static variables/non static functions

