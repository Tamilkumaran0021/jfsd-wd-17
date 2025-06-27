package module_1.day.three;

public class Functions {
    // main method or main function
    public static void main(String[] args) {
//        add(100, 200); // function call or function invocation

        // x+y-z
        int sum = add(100, 200);
        System.out.println(sum - 300);

    }

    // custom function or user defined function
    public static int add(int a, int b) { // function arguments or function parameters
        int x = a;
        int y = b;
        System.out.println(x + y);

        return x + y;
    }
}


// main -> add