package OCP;

public class InternSalaryCalculator implements SalaryCalculator {
    @Override
    public double calculate(double baseSalary) {
        return baseSalary * 0.8;
    }
}