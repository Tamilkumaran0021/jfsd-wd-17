package day.five;

public class Array {
    // array
    public static void main(String[] args) {
        // data structure -> create, add , read , update , delete , search

//        int[] arr = new int[10]; // 0-9
////        System.out.println(arr[0]); // read
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 100 * i; // add or  update
//        }
//
////        //search
////        int x = 300;
////        for (int i = 0; i < arr.length; i++) {
////            if (arr[i] == x) {
////                System.out.println("found x at index : " + i);
////                break;
////            }
////        }
//
////        // delete
////        int x = 300;
////        int index = -1;
////
////        for (int i = 0; i < arr.length; i++) {
////            if (arr[i] == x) {
////                index = i;
////                break;
////            }
////        }
////
////        System.out.println(index);
////        for (int i = index; i < arr.length - 1; i++) {
////            arr[i] = arr[i + 1];
////            //    9         10
////        }
////
////        arr[arr.length - 1] = 0;
////        for (int i = 0; i < arr.length; i++) {
////            System.out.println(arr[i]);
////        }
//
//        System.out.println(arr[2]);
//        arr = new int[15];
//        System.out.println(arr[2]);

        int[] arr = new int[10];

//        int[][] arr1 = new int[10][10];
        int[][] arr1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = 1000;
            }
        }


    }
}

// delete, create -> not suitable for write operations
// read -> suitable for read operations