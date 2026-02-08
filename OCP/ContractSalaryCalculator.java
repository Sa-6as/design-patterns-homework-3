package OCP;

public class ContractSalaryCalculator implements SalaryCalculator {
    @Override
    public double calculate(double baseSalary) {
        return baseSalary * 1.1;
    }
}