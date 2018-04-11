package statistics.variance;

import org.junit.Test;

import java.util.Arrays;

public class SampleVarianceCalculateTest {

    @Test
    public void testCalc() {
        SampleVarianceCalculate calculate = new SampleVarianceCalculate();
        double result = calculate.calc(Arrays.asList(1.0, 2.0, 3.0));
        System.out.println(result);
    }
}
