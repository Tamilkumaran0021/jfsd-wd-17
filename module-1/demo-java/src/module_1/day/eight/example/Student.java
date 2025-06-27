package module_1.day.eight.example;

public class Student {
    public String name;
    public int age;
    public double grade;
    public String password = "test@123";


    public Student() {

    }

    public Student(String peter, int i, double v) {
    }


    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.password);
    }
}
