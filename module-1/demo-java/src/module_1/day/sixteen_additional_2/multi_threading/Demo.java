package module_1.day.sixteen_additional_2.multi_threading;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Hello");
        System.out.println(1 / 0);

        // Vector , Hashtable, ... ---> 10,000 -> Thread safe data structure
        // Map, List , Set -> Non thread safe

//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("hello");
//
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("hello");
    }
}
