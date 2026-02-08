package OCP;

public class Employee {
    private String name;
    private double baseSalary;
    private SalaryCalculator salaryCalculator;

    public Employee(String name, double baseSalary, SalaryCalculator salaryCalculator) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.salaryCalculator = salaryCalculator;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateSalary() {
        return salaryCalculator.calculate(baseSalary);
    }
}