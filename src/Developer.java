public class Developer extends Employee {
    private String programmingLanguage;


    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    String printInfo() {
        return "Employee Name: " + getName() + ", ID: " + getId() + ", Salary: " + getSalary() + ", programming language: " + programmingLanguage;
    }
}
