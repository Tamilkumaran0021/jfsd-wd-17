package module_1.day.eleven_twelve.collections.set;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // Set -> to store unique values [ HashSet, LinkedHashSet, TreeSet ]
//        Set<String> set = new TreeSet<>();
        Set<String> set = new TreeSet<>(Collections.reverseOrder());
        set.add("john");
        set.add("adam");
        set.add("peter");
        set.add("zack");

        System.out.println(set);

    }

    public static void setMethods() {

//        List<Integer> list = Arrays.asList(10001,20002,10001,909990);
//        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        set.add(10001);
        set.add(20002);
        set.add(10001);
        set.add(909990);

        set.remove(10001);
//        System.out.println(set.contains(20002));

//        System.out.println(set.get());

//        List<Integer> list = new ArrayList<>(set);
//        System.out.println(list.get(0));


//        for (int i = 0; i < set.size(); i++) {
//            System.out.println(set.get(i));
//        }

        for (Integer i : set) {
            System.out.println(i);
        }
    }
}

// HashSet -> hashing -> j * 10^3 + o*10^2 + h*10^1 + n*10^0 ---> 10000
//    - time: o(1)

// HashSet > LinkedHashSet > TreeSet