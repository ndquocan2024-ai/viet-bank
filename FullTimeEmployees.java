package src;

public class FullTimeEmployees extends Employees {
    private double bonus;

    public FullTimeEmployees(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    public String toString() {
        return "FullTimeEmployee: " + getId() + " " + getName()
                + " Base Salary: " + getBaseSalary()
                + " Bonus: " + bonus
                + " Total: " + calculateSalary();
    }
}
