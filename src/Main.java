
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe");
        System.out.println(Employee.companyName);
        Employee employee2 = new Employee("John Dnfd");
        System.out.println(Employee.companyName);
        System.out.println(employee);
    }
}