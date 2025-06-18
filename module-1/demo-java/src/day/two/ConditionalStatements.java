package day.two;

public class ConditionalStatements {
    public static void main(String[] args) {
        // conditional statements -> if , if else , if else-if else , switch case , nested if

        int age = 18;
        int amount = 120;

//        if (age >= 18){
//            System.out.println("you are allowed");
//        }
//
//        if (age < 18){
//            System.out.println("you are not allowed");
//        }


//        if (age >= 18) {
//            System.out.println("you are allowed");
//        } else {
//            System.out.println("you are not allowed");
//        }


//        if (age >= 18 & amount >= 120) {
//            System.out.println("you are allowed");
//        } else if (amount < 120) {
//            System.out.println("insufficient balance");
//        } else {
//            System.out.println("you are underage");
//        }


        int day = 4;

//        if (day == 1) {
//            System.out.println("sun");
//        } else if (day == 2) {
//            System.out.println("mon");
//        } else if (day == 3) {
//            System.out.println("tue");
//        } else if (day == 4) {
//            System.out.println("wed");
//        } else if (day == 5) {
//            System.out.println("thurs");
//        } else if (day == 6) {
//            System.out.println("fri");
//        } else if (day == 7) {
//            System.out.println("sat");
//        } else {
//            System.out.println("invalid input");
//        }

//        switch (day) {
//            case 1:
//                System.out.println("sun");
//                break;
//            case 2:
//                System.out.println("mon");
//                break;
//            case 3:
//                System.out.println("tue");
//                break;
//            case 4:
//                System.out.println("wed");
//                break;
//            case 5:
//                System.out.println("thurs");
//                break;
//            case 6:
//                System.out.println("fri");
//                break;
//            case 7:
//                System.out.println("sat");
//                break;
//            default:
//                System.out.println("invalid input");
//        }

        char name = 'c';

//        if (age >= 18) {
//            if (amount >= 120 & name == 'a' | name == 'b') {
//                System.out.println("you are allowed");
//            } else {
//                System.out.println("insufficient balance");
//            }
//        } else {
//            System.out.println("you are underage");
//        }


        int number = 11; // 2,4,6,8,10,12,

        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }


    }
}
