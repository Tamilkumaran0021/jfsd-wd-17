package day.eight.example;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.password);
    }
}


// private -> can be accessed within the same class only
// default -> can be accessed within the same class + other classes in same package
// protected -> can be accessed within the same class + other classes in same package + child classes in other package
// public -> anyone can access


// private > default > protected > public ----> access modifiers