package module_1.day.eight.problems;

import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        // recursion -> calling a function within its own function body
//        add();

//        for (int i = 1; i <= 5 ; i++) {
//            System.out.println(i);
//        }

//        print(1);
//        System.out.println(factorial(3));

        String str = "hello world";
        String[] arr = str.split(" ");

        System.out.println(arr[0]);

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] s = line.split(" ");

        int i = Integer.parseInt(s[2]);

        System.out.println(i);

    }

//    public static void add() {
//        System.out.println(1 + 1);
//        add();
//    }

    public static void print(int i) {
        if (i <= 5) { // base condition
            System.out.println(i);
            i++;
            print(i);
        }
        return;
    }

    // 5! ---> 5*4*3*2*1
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}
