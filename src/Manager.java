public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printInfo() {
        System.out.println("Manager | ID: " + getId() +
                ", Name: " + getName() +
                ", Total salary: " + (getSalary() + bonus));
    }
}
