import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NetSalaryTest {

    @Test
    public void testCalculateNetSalary() {
        double basic = 10000;
        double allowances = 2000;
        double tax = 500;

        double expected = 11500;
        double actual = NetSalary.calculateNetSalary(basic, allowances, tax);

        assertEquals(expected, actual, 0.001);
    }
}
