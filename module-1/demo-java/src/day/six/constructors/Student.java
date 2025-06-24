package day.six.constructors;

public class Student {

    // default constructor
    public Student() {

    }


    // parametrised constructor
    public Student(String _name, int _age, double _gradle) {
//        System.out.println("hi from constructor");
        name = _name;
        age = _age;
        grade = _gradle;
    }


    public String name;
    public int age;
    public double grade;
}
