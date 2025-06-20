package day.two;

public class Loops {
    public static void main(String[] args) {
        // loops -> while , for , do while

//        while (true){
//            System.out.println("from if");
//        }

//        int counter = 3;
//        while (counter > 0) {
//            System.out.println(counter);
//            counter--;
//        }

//        for (int counter = 3;counter > 0; counter--){
//            System.out.println(counter);
//        }

//        int counter = 0;
//        do {
//            System.out.println(counter);
//            counter--;
//        }while (counter > 0);

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.println(j); // 1[5] 2[5] 3[5] 4[5] 5[5]
//            }
//        }

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                for (int k = 1; k <= 5; k++) {
//                    System.out.println(k);
//                }
//            }
//        }

//        int k = 1;

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(k);
//                k++;
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5 - i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 4 - i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
