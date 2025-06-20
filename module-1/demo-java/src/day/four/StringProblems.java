package day.four;

public class StringProblems {
    public static void main(String[] args) {
        String s = "hello world";
        //          012345678910

//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }

//        for (int i = s.length() - 1; i >= 0; i--) {
//            System.out.println(s.charAt(i));
//        }

        _isPalindrome(s);
    }

    // palindrome -> madam
    public static void isPalindrome(String s) {
        // reverse
        // compare
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
            //         ""     + d ----> reverse = d
            //         d      + l ----> reverse = dl
            //         dl     + r ----> reverse = dlr
        }

        if (s.equals(reverse)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }

    public static void _isPalindrome(String s) {
        boolean flag = true;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                //       0               10
                //       1               10 -1 = 9
                //       2               10 -2 = 8
                //       10              10 -10 = 0
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }


    }

}

// 10  9 8
//  0  1 2
