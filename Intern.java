package src;

public class Intern extends Employees {
    private double supportRate;

    public Intern(int id, String name, double baseSalary, double supportRate) {
        super(id, name, baseSalary);
        this.supportRate = supportRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * supportRate;
    }

    public String toString() {
        return "Intern: " + getId() + " " + getName()
                + " Base Salary: " + getBaseSalary()
                + " Support rate: " + supportRate
                + " Total: " + calculateSalary();
    }
}
