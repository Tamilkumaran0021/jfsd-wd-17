package module_1.day.six.constructors;

public class Demo {
    static int x = 100;

    public static void main(String[] a) {
//        Student john = new Student();
//        john.name = "john";
//        john.age = 18;
//        john.grade = 4.5;
//
//
//        Student peter = new Student("peter", 17, 4.8);
//
////        System.out.println(peter.name);
//        System.out.println(peter);
//        System.out.println(peter.get());


//        int x = 1000;


        Person person = new Person("12121221", "empdn11212");
        System.out.println(person.aahaarNo);


        Student peter = new Student("peter", 17, 4.8, "12121212", "wewe121212");
        System.out.println(peter.aahaarNo);
    }

    public static void add() {
        Demo demo = new Demo();
        System.out.println(Demo.x);
    }
}
