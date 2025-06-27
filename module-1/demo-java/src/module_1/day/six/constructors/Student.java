package module_1.day.six.constructors;

public class Student extends Person {

    // default constructor
    public Student() {

    }

    public String name;
    public int age;
    public double grade;

    // parametrised constructor
    public Student(String name, int age, double grade) {
//        System.out.println("hi from constructor");

        this.name = name;
        this.age = age;
        this.grade = grade;
        this.add();
    }

    public Student(String name, int age, double grade, String aahaarNo, String panCard) {
//        System.out.println("hi from constructor");

        super(aahaarNo, panCard);
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.add();
        super.sub();
    }

    public void add() {

    }

    public Student get() {
        return this;
    }


}
