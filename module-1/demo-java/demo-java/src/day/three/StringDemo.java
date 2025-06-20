package day.three;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hello world"; // 1 GB     ------------> 104+101+....... -> 10000
        //           012345678910 --> locations or index
        String s2 = "hello worldd"; // 1 GB ??? ------------> 10010
        String s3 = new String("hello world");

//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s1.equals(s3));

//        System.out.println(s1.toUpperCase());
//        s1 = "hello earth";
//        System.out.println(s1);

//        System.out.println(s1.replace("l","z"));
//        System.out.println(s1);
//        System.out.println(s1.startsWith("hel"));
//        System.out.println(s1.endsWith("hel"));
//        System.out.println(s1.contains("o wo"));

//        System.out.println(s1.charAt(2));
//        System.out.println(s1.indexOf("l"));
//        System.out.println(s1.lastIndexOf("l"));
//        System.out.println(s1.substring(5,9));
//        System.out.println(s1.length());
//        System.out.println(s1 + s2);
//        System.out.println(s1.concat(s2));

//        System.out.println(s1.trim());
//        System.out.println(s1);

//        System.out.println(s1.compareTo(s2));

//        char ch = 'A';
//        int i = ch;
//
//        System.out.println(i);

    }
}

// string intern pool
// strings are immutable