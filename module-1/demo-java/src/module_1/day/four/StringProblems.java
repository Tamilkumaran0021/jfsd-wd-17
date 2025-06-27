package module_1.day.four;

import java.util.Arrays;

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

//        _isPalindrome(s);

        isAnagram("dog", "god");
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

    // dog , god -> o(n2)
    // o(n)
    public static void isAnagram(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);

        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }

    public static void _isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] chars = new char[26]; // 0       -  25
        //                              97 % 97 - 122 % 97

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            int j = c;
            chars[j % 97]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            int j = c;
            chars[j % 97]--;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 0) {
                System.out.println("not an anagram");
                break;
            }
        }


    }


}
