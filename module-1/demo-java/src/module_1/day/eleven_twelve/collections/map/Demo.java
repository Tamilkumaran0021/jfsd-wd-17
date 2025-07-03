package module_1.day.eleven_twelve.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        charFrequency("wwwccaddddw");
    }

    // String str = "wwwccaddddw"; // w4c2a1d4
    public static void charFrequency(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                int oldValue = map.get(ch);
                map.put(ch, oldValue + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println(map);
    }

    public static void types() {
        // Map ->  [ HashMap, LinkedHashMap, TreeMap ]
        Map<String, Long> map = new TreeMap<>();
        map.put("john", 9000000000l);
        map.put("peter", 700000000l);
        map.put("john", 700000000l);
        map.put("zack", 9000000000l);

        System.out.println(map);
    }

    public static void mapMethods() {
        Map<String, Long> map = new HashMap<>();
        map.put("john", 9000000000l);
        map.put("peter", 700000000l);
        map.put("john", 700000000l);
        map.put("zack", 9000000000l);

//        System.out.println(map.get("john"));
//        System.out.println(map.containsKey("john"));
//        System.out.println(map.containsValue(700000000l));

//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            System.out.println(key);
//        }

//        Collection<Long> values = map.values();
//        for (Long value : values) {
//            System.out.println(value);
//        }

//        Set<Map.Entry<String, Long>> entries = map.entrySet();
//        for (Map.Entry<String, Long> entry : entries) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
    }
}
