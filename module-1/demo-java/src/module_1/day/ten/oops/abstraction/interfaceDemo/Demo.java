package module_1.day.ten.oops.abstraction.interfaceDemo;


public class Demo {
    public static void main(String[] args) {
        // anonymous class
//        Car car = new Car() {
//            public void breaks() {
//                System.out.println("breaks");
//            }
//        };

//        Car car = new Bmw();
//        car.breaks();

        print(new Bmw());
        print(new Tata());

        System.out.println(Car.x);

    }

    public static void print(Car car){
        car.breaks();
    }
}

interface A {
    void add();

    void sub();
}

interface B {
    void add();
}

class C implements A, B {

    @Override
    public void add() {

    }

    public void sub() {

    }
}

interface D extends B {

}
