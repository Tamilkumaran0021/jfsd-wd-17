package day.five;

public class ArrayProblems {
    public static void main(String[] args) {
//        int[] arr = new int[10];
        int[] arr = {22, 0, -1, 19, 11, 7};
//        findMax(arr);

        sorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // find the max value from the array
    public static void findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max value is : " + max);

    }

    public static void findMin(int[] arr) {

    }

    // linear search
    public static void search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("found target");
                break;
            }
        }

        // best -> o(1) , worst -> o(n)
    }

    // bubble sort -> time complexity -> o(n2)
    public static void sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) { //         o(n)
            for (int j = i + 1; j < arr.length; j++) { // o(n)    // 1(n) 2(n) 3(n).......... n(n) --> n2
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
