package day.six.constructors;

public class Demo {
    public static void main(String[] args) {
        Student john = new Student();
        john.name = "john";
        john.age = 18;
        john.grade = 4.5;


        Student peter = new Student("peter", 17, 4.8);

        System.out.println(peter.name);


    }

    public static void add() {

    }
}
