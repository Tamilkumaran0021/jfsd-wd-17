package module_1.day.seven;

public class Problems {
    public static void main(String[] args) {
//        reverseNumber(102);
        int[][] arr1 = {
                {1, 2},
                {3, 4}
        };
        int[][] arr2 = {
                {5, 6},
                {0, 7}
        };
        matrixMultiplication(arr1, arr2);
    }

    // reverse number -> 102 -> 2  --> reverse =   2
    //                   10  -> 0  --> reverse =  20
    //                   1   -> 1  --> reverse = 201
    //                   0
    public static void reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(reversed);
    }

    public static void matrixMultiplication(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr1.length]; // n*m --> n2

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                for (int k = 0; k < arr1.length; k++) {
                    result[i][j] = result[i][j] + arr1[i][k] * arr2[k][j];
                    //     0  0           0  0  +      0  0   *     0  0
                    //     0  0           0  0  +      0  1   *     1  0
                    //     0  1           0  1  +      0  0   *     0  1
                    //     0  1           0  1  +      0  1   *     1  1
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
