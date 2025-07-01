package module_1.day.eleven.exceptionHandling;

public class ThrowDemo {
    //
    public static void main(String[] args) throws Exception{
        try {
            print();
        } catch (Exception e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void print() throws Exception{
//        try {
//            isEligible(10);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        isEligible(10);
        System.out.println("after isEligible");
    }

    public static void isEligible(int age) throws Exception {
        if (age >= 18) {
            System.out.println("eligible");
        } else {
            throw new AgeException("Please send values more than 18");
        }
    }
}

class AgeException extends Exception{
    public AgeException(String message) {
        super(message);
    }
}