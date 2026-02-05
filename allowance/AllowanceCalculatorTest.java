import org.junit.Test;
import org.junit.Assert;

public class AllowanceCalculatorTest {

    @Test
    public void testCalculateAllowance() {

        // Test case 1
        Assert.assertEquals(3500.0,
                AllowanceCalculator.calculateAllowance(10000),
                0.001);

        // Test case 2
        Assert.assertEquals(1750.0,
                AllowanceCalculator.calculateAllowance(5000),
                0.001);

        // Test case 3
        Assert.assertEquals(0.0,
                AllowanceCalculator.calculateAllowance(0),
                0.001);
    }
}
