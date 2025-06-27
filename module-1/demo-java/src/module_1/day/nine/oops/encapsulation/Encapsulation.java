package module_1.day.nine.oops.encapsulation;

public class Encapsulation {
    // - encapsulation : hiding data from outside classes, we can give read access or both read and write access
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getPassword());
        student.setPassword("user@123");
        System.out.println(student.getPassword());

    }
}
