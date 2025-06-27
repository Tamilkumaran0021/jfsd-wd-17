package module_1.day.four;


import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        System.out.println("The square of the number is :" + i * i);
        System.out.println("The square of the number is :" + i * j);
    }
}
