import java.util.Scanner;

public class EmployeeMapDemo {
    public static void main(String[] args) {

        EmployeeMap employeeMap = new EmployeeMap();

        employeeMap.add(new Employee("Billy", 1));
        employeeMap.add(new Employee("Haley", 7));
        employeeMap.add(new Employee("David", 0));
        employeeMap.add(new Employee("Bob", 42));

        System.out.println(employeeMap.lookUp((1)));
        System.out.println(employeeMap.lookUp((7)));
        System.out.println(employeeMap.lookUp((0)));
        System.out.println(employeeMap.lookUp((42)));
    }
}
