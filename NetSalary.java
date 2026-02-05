public class NetSalary {

    public static double calculateNetSalary(double basic, double allowances, double tax) {
        return basic + allowances - tax;
    }

    public static void main(String[] args) {
        double basic = 12000;
        double allowances = 3000;
        double tax = 1500;

        double netSalary = calculateNetSalary(basic, allowances, tax);

        System.out.println("Net Salary: " + netSalary);
    }
}
