package module_1.day.ten.oops.abstraction.abstractClass;


public class Demo {
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            public void breaks() {
                System.out.println("breaks");
            }
        };


        car.breaks();

    }
}
