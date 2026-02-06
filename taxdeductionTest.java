import org.junit.*;

public class taxdeductionTest {

    @Test
    public void testCalculateTax() {

        // basicSalary = 10000, totalAllowance = 3500
        // gross = 13500 → tax = 10% = 1350
        Assert.assertEquals(1350.0,
                     taxdeduction.calculateTax(10000, 3500),
                     0.001);

        // basicSalary = 5000, totalAllowance = 1750
        // gross = 6750 → tax = 675
        Assert.assertEquals(675.0,
                     taxdeduction.calculateTax(5000, 1750),
                     0.001);

        // basicSalary = 0, totalAllowance = 0
        // gross = 0 → tax = 0
        Assert.assertEquals(0.0,
                     taxdeduction.calculateTax(0, 0),
                     0.001);
    }
}
