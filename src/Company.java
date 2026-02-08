public class Company {
    private String companyName;
    private Employee[] employees;
    private int count;

    public Company(String companyName, int size) {
        this.companyName = companyName;
        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count++] = e;
        }
    }

    public void printAllEmployees() {
        System.out.println("Company: " + companyName);
        for (int i = 0; i < count; i++) {
            employees[i].printInfo();
        }
    }

    // поиск по id
    public Employee findEmployeeById(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    // вывод только разработчиков
    public void printOnlyDevelopers() {
        for (int i = 0; i < count; i++) {
            if (employees[i] instanceof Developer) {
                employees[i].printInfo();
            }
        }
    }
}
