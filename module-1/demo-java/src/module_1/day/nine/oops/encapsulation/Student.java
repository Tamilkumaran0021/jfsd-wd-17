package module_1.day.nine.oops.encapsulation;

public class Student {
    public String name;
    public int age;
    public double grade;
    private String password = "test@123";


    public Student() {

    }

    public Student(String peter, int i, double v) {
    }

    // setter method
    public void setPassword(String password) {
        this.password = password;
    }

    // getter method
    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.password);
    }
}
