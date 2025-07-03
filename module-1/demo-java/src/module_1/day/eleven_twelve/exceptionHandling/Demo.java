package module_1.day.eleven_twelve.exceptionHandling;

public class Demo {
    public static void main(String[] args) {
        try {
            String s = "hello world";
            System.out.println(s.charAt(1));
//            System.out.println(1 / 0);
            String x = null;
            System.out.println(x.length());
        } catch (StringIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception");
        } catch (Exception e) {
            System.out.println("from exception catch block");
        } finally {
            System.out.println("from finally");
        }
    }
}

// compile time
// run time