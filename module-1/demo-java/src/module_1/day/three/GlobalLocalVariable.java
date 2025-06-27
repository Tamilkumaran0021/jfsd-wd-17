package module_1.day.three;

public class GlobalLocalVariable {

    static int x = 1000; // global variable or class variable
    int y = 2000;

    public static void main(String[] args) {
        int x = 100; // local variable
        System.out.println(x);

        add();
    }

    public static void add() {
        System.out.println(x);
    }
}
