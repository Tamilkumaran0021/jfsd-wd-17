package module_1.day.eleven_twelve;

public class Demo {
    public static void main(String[] args) {
        double x = 424.33;
        long left = (long) x;
        long right = (long) ((x % 1) * Math.pow(10, 16));

        int leftSum = getSum(left); // 1
        int rightSum = getSum(right); // 2

        double result = (leftSum * 10) + rightSum;

//        System.out.println((double) result / 10);
        System.out.println(right);
    }

    public static int getSum(long num) {
        if (num == 0) {
            return 0;
        }
        int leftSum = 0;

        while (num > 0) {
            long reminder = num % 10; // 2
            leftSum += reminder; // 6
            num = num / 10; // 42
        }

        if (leftSum >= 10) {
            return getSum(leftSum);
        }
        return leftSum;
    }
}
