import src.Employees;
import src.FullTimeEmployees;
import src.Intern;

public class Main {
    public static void main(String[] args) {
        Employees e1 = new FullTimeEmployees(01, "Hoang", 10000000, 2500000);
        Employees e2 = new Intern(02, "Thanh", 5000000, 0.5);
        System.out.println(e1);
        System.out.println(e2);
    }
}