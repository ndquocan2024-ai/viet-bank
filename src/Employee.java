package src;

public abstract class Employees {
    private static int totalEmployees = 0;

    private int id;
    private String name;
    private double baseSalary;
    public static String bankName = "VietBank";

    public Employees(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public static int getTotalEmployees() { return totalEmployees; }
    public int getId() { return id; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
}
