package module_1.day.five;

public class ArrayProblems {
    public static void main(String[] args) {
//        int[] arr = new int[10];
        int[] arr = {22, 0, -1, 19, 11, 7};
//        findMax(arr);

//        sorting(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        secondLargest(arr);

        int[] arr1 = {1, 3, 5, 6};
        int[] arr2 = {2, 4, 6, 7, 8};
        mergeArray(arr1, arr2);
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

    // time complexity  -> o(n)
    // space complexity -> o(n) -> including the input array , o(1) -> excluding the input array
    public static void secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second max value is : " + secondMax);
    }

    public static void mergeArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) { //   o(n + n ) -> o(n) -----> o(n) + o(n) + o(n) ----> o(n)
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n) { //        o(n)
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < m) { //         o(m)
            result[k] = arr2[j];
            j++;
            k++;
        }

        for (int l = 0; l < result.length; l++) {
            System.out.println(result[l]);
        }
    }


}
