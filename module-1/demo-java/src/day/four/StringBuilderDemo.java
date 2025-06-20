package day.four;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // immutable string
//        String s = "hello world"; // "hello world"
//        s = s + " from"; // "hello world from"
//        s = s + " java"; // "hello world from java"
//
//        System.out.println(s);

        // mutable string

        StringBuilder sb = new StringBuilder("hello world"); // [h,e,l,l,o, ,w,o,r,l,d]
        sb.append(" from"); // [h,e,l,l,o, ,w,o,r,l,d, ,f,r,o,m]
        sb.append(" java");// [h,e,l,l,o, ,w,o,r,l,d, ,f,r,o,m, ,j,a,v,a]

        System.out.println(sb);
    }
}


// StringBuffer