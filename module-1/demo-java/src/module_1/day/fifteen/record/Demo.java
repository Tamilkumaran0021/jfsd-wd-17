package module_1.day.fifteen.record;

public class Demo {
    public static void main(String[] args) {
//        Employee employee = new Employee("john", 20);
//        Employee employee1 = new Employee("john", 20);
//        System.out.println(employee.getName());
//        System.out.println(employee.equals(employee1));

        _Employee employee1 = new _Employee("john", 20);
        _Employee employee2 = new _Employee("john", 20);

        System.out.println(employee1.age());
        System.out.println(employee1.equals(employee2));
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employee1);
    }
}
