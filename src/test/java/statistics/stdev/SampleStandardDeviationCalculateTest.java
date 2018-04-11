package statistics.stdev;

import org.junit.Test;
import statistics.stdev.SampleStandardDeviationCalculate;

import java.util.Arrays;

public class SampleStandardDeviationCalculateTest {

    @Test
    public void testCalc() {
        SampleStandardDeviationCalculate calculate = new SampleStandardDeviationCalculate();
        double result = calculate.calc(Arrays.asList(1.0, 2.0, 3.0, 4.0));
        System.out.println(result);
    }
}
