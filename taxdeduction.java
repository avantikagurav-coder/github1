public class taxdeduction{

    // Method to calculate tax deduction
    public static double calculateTax(double basicSalary, double totalAllowance) {
        double grossSalary = basicSalary + totalAllowance;
        double tax = grossSalary * 0.10;   // 10% tax deduction
        return tax;
    }
}

