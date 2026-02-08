package OCP;

public class PermanentSalaryCalculator implements SalaryCalculator {
    @Override
    public double calculate(double baseSalary) {
        return baseSalary * 1.2;
    }
}