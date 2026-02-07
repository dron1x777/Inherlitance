public class Company {
    private String companyName;
    private Employee[] employees;
    private int count;

    public Company(String companyName, int size) {
        this.companyName = companyName;
        this.employees = new Employee[size];
        this.count = 0;
    }

    public void addEmployee(Employee e) {
        if (count >= employees.length) {
            System.out.println("Компания заполнена");
            return;
        }
        employees[count] = e;
        count++;
    }

    public void printAllEmployees() {
        System.out.println("Компания: " + companyName);
        for (int i = 0; i < count; i++) {
            employees[i].printInfo();
        }
    }
    public Employee findEmployeeById(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    public void printOnlyDevelopers() {
        for (int i = 0; i < count; i++) {
            if (employees[i] instanceof Developer) {
                employees[i].printInfo();
            }
        }
    }

}
