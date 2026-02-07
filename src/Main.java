
public class Main {
    public static void main(String[] args) {
        Company company = new Company("Nigga",6);
        Manager manager = new Manager("Somebody1", 3456, 200, 100);
        Manager manager2 = new Manager("Somebody2", 3456, 200, 200);
        Developer developer = new Developer("somebody3", 1234, 23456, "JAVA");
        Developer developer2 = new Developer("somebody4", 1234, 34456, "JAVA");
        company.addEmployee(developer);
        company.addEmployee(developer2);
        company.addEmployee(manager);
        company.addEmployee(manager2);
        company.printAllEmployees();
        company.printOnlyDevelopers();
    }
}