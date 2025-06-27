package module_1.day.one;

public class TypeCasting {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double [implicit]
        // long -> int [explicit]


//        int x = 100;
//
//        long l = 10000000000l;
//
//        int y = (int) l;
//
//        System.out.println(y);


//        int x = 100;
//        int x = 200; // error


        long l = 10050000000l;
        float f = l; // 1.0 * 10(10)
        double d = f;

        System.out.println(f);

    }
}
